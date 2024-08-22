import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        int input1 = getArraySize("Enter the number of data to be key in to array 1 : ");
        double[] array1 = getArrayInput(input1, "Enter the input into array 1: ");

        int input2 = getArraySize("Enter the number of data to be key in to array 2 : ");
        double[] array2 = getArrayInput(input2, "Enter the input into array 2: ");

        double median = calculation(array1, array2);
        System.out.printf("The median is: %.3f%n", median);
    }

    private static int getArraySize(String prompt) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                size = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                if (size >= 1 && size <= Integer.MAX_VALUE) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a valid input.");
                }
            } else {
                System.out.println("Please enter an integer.");
                sc.nextLine(); // Consume the invalid input
            }
        }

        return size;
    }

    private static double[] getArrayInput(int size, String prompt) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[size];

        for (int i = 0; i < size; i++) {
            boolean validInput = false;

            while (!validInput) {
                System.out.print(prompt);
                String input = sc.nextLine();

                if (!input.isEmpty()) {
                    try {
                        array[i] = Double.parseDouble(input);
                        validInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid double.");
                    }
                } else {
                    System.out.println("Please do not leave it blank");
                }
            }
        }

        return array;
    }

    private static double calculation(double[] array1, double[] array2) {
        double[] FArray = new double[array1.length + array2.length];
        System.arraycopy(array1, 0, FArray, 0, array1.length);
        System.arraycopy(array2, 0, FArray, array1.length, array2.length);
        for (int j = 0; j < FArray.length - 1; j++) {
            for (int i = 0; i < FArray.length - j - 1; i++) {
                if (FArray[i] > FArray[i + 1]) {
                    double temp = FArray[i];
                    FArray[i] = FArray[i + 1];
                    FArray[i + 1] = temp;
                }
            }
        }
        int num = FArray.length;
        double median;
        if (num % 2 == 0) {
            median = (FArray[(num / 2) - 1] + FArray[(num / 2)]) / 2;
        } else {
            median = FArray[(int) ((num / 2) + 0.5)];
        }
        return median;
    }
}
