import pandas as pd

data=pd.read_csv("C:\\Users\\HP\\PycharmProjects\\Hackathon\\UMH24 - FinTech Dataset.xlsx - Ahmad.csv")
print(data)
datas = data['WITHDRAWAL AMT'].str.replace(',', '').astype(float)
maximum=datas.max()
print("Maximum withdrawal amount:"+str(maximum))