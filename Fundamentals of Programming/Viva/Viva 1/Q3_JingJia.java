/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost  /SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva_group;

import java.util.Scanner;
public class Q3_JingJia {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int number = num; //variable number equals to user input since the num will be changing throughout the program
        int totalFac = 0;
        int sum = 1;
        //0!=1
        if (number == 0) {
            totalFac = 1;
        }

        for (; num != 0; num = num / 10) {//use for loop to separate each digit of an integer. divide the number by 10 and get the remainder, repeat the loop until the number becomes 0.
            int remainder = num % 10;

            for (int i = 1; i <= remainder; i++) {//use for loop to calculate the factorial, start with i=1 and repeat until i is less than or equal to remainder.
                sum = sum * i;
            }

            totalFac = totalFac + sum;
            sum = 1;
        }

        System.out.println("The sum of the factorial of each digits is: " + totalFac);

        if (totalFac == number) {
            System.out.println("This is a strong number.");
        } else {
            System.out.println("This is not a strong number.");
        }

    }
}
