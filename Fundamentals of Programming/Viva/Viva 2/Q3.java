/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputArr = new String[6];

        // Accept input from the user for each element in the array
        System.out.println("Enter the elements of the array:");
        for (int i=0; i<6; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            inputArr[i] = sc.next();
        }

        // Check the numerical validity of each element in the array
        boolean[]resultArr = checkNumValid(inputArr);

        // print the results
        printResult(inputArr, resultArr);
    }

    // Method to check if a given string is a valid numeric representation
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);  // Used to convert a String representing a floating-point number into its double representation.
            return true;  // If it is a numeric number (the conversion is successful), return true 
        } 
        catch (NumberFormatException e) {
            return false;  // If it is not a numerical number, return false
        }
    }
    
    // Method to check the numerical validity of each element in the array
    public static boolean[]checkNumValid(String[]inputArr) {
        boolean[]resultArr = new boolean[inputArr.length];

        for (int i = 0; i < inputArr.length; i++) {
            resultArr[i] = isNumeric(inputArr[i]);  // Using the isNumeric method to check if the element is a valid numeric representation
        }

        return resultArr;
    }

    // Method to print the results
    public static void printResult(String[] inputArr, boolean[]resultArr) {
        System.out.println("Results:");
        for (int i = 0; i < inputArr.length; i++) {
            System.out.println("Input: " + inputArr[i] + "      Validity: " + resultArr[i]);
        }
    }
}