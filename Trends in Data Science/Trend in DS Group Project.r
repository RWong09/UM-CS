#Load libraries
library(tidyverse)
library(caret)
library(ggplot2)
library(dplyr)
library(FSelector)

#Load dataset
data <- read.csv("c:/Users/HP/OneDrive/Documents/VSC codes/Trends in DS Projects/adult.csv", stringsAsFactors = TRUE)
cat("Initial Data Shape:", dim(data), "\n")
str(data)

#Data Preprocessing by replacing "?" with NA
data[data == "?"] <- NA

#Check for missing values
colSums(is.na(data))

#Drop rows with missing values
data <- na.omit(data)

#Check duplicates
cat("Duplicated rows (before):", sum(duplicated(data)), "\n")
data <- data[!duplicated(data), ]
cat("Duplicated rows (after):", sum(duplicated(data)), "\n")
str(data)

#EDA
#Age group
data$age_group <- cut(data$age, breaks = c(0,25,35,45,55,65,100), 
labels = c('0-25','25-35','35-45','45-55','55-65','65+'))

#Income distribution
ggplot(data, aes(x = income)) + 
  geom_bar() + 
  ggtitle("Income Distribution") + 
  xlab("Income") + ylab("Count")

#Percentage of income for different age groups
age_income_ratio <- data %>%
  group_by(age_group, income) %>%
  summarise(count = n()) %>%
  group_by(age_group) %>%
  mutate(percentage = count / sum(count) * 100)

ggplot(age_income_ratio, aes(x = age_group, y = percentage, fill = income)) +
  geom_bar(stat = "identity", position = "stack") +
  ggtitle("Percentage of Income for Different Age Groups") +
  ylab("Percentage") + xlab("Age Group")

#Income by education
ggplot(data, aes(x = education, fill = income)) +
  geom_bar(position = "dodge") +
  theme(axis.text.x = element_text(angle = 45, hjust = 1)) +
  ggtitle("Income Distribution by Education Level")

#Income by gender
ggplot(data, aes(x = sex, fill = income)) +
  geom_bar(position = "dodge") +
  ggtitle("Income Distribution by Gender")

#Binary encode income
data$income <- as.factor(ifelse(data$income == ">50K", 1, 0))

#Define feature sets
num_features <- c("age", "education.num", "hours.per.week", "capital.gain", "capital.loss")
cat_features <- c("workclass", "marital.status", "relationship", "sex")

#Convert categorical variables to factor
data[cat_features] <- lapply(data[cat_features], as.factor)

#One-hot encode categorical variables
dummies <- model.matrix(~ . - 1, data = data[, cat_features])
full_data <- cbind(data[, num_features], dummies)
full_data <- as.data.frame(scale(full_data))  # scale numeric features

#Combine with label
full_data$income <- data$income

#Train-test split
set.seed(42)
trainIndex <- createDataPartition(full_data$income, p = .8, list = FALSE)
train_data <- full_data[trainIndex, ]
test_data <- full_data[-trainIndex, ]

#Feature Selection using Information Gain (mutual information analogue)
weights <- information.gain(income ~ ., data = train_data)

#Remove features with NA or zero importance
weights <- na.omit(weights)
weights <- weights[weights$attr_importance > 0, , drop = FALSE]

#If fewer than 10 features remain, select as many as possible
num_to_select <- min(10, nrow(weights))
if (num_to_select == 0) {
  stop("No informative features found by information.gain. Please check your data or try another method.")
}

top_features <- rownames(head(weights[order(-weights$attr_importance), , drop = FALSE], num_to_select))

cat("Number of top features selected:", length(top_features), "\n")
cat("Top features selected:\n")
print(top_features)

#Final training/testing sets
train_final <- train_data[, c(top_features, "income"), drop = FALSE]
test_final <- test_data[, c(top_features, "income"), drop = FALSE]

#Train Logistic Regression Model
model <- glm(income ~ ., data = train_final, family = binomial)

#Predict
pred_probs <- predict(model, newdata = test_final, type = "response")
pred <- ifelse(pred_probs > 0.5, 1, 0)

#Evaluate the model
confusion <- caret::confusionMatrix(as.factor(pred), as.factor(test_final$income))
print(confusion)

#Feature Importance (Coefficients)
importance <- summary(model)$coefficients
print(importance)
