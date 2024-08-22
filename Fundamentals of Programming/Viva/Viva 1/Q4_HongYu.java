/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva_group;

import java.util.Scanner;
public class Q4_HongYu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password : ");
        String PW = sc.nextLine();
        if (PW == null || PW.isEmpty()) {
            System.out.println("Please enter a valid password");
        } else {

            int counter = 0, subcounter = 0, lowerCase = 0, upperCase = 0, specialCharCount = 0, digit = 0;
            char[] specialChar = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};

            //check the existance of the requirement in the password key in by user
            for (int i = 0; i < PW.length(); i++) {
                if (PW.charAt(i) >= 'a' && PW.charAt(i) <= 'z') {
                    lowerCase += 1;
                }
                if (PW.charAt(i) >= 'A' && PW.charAt(i) <= 'Z') {
                    upperCase += 1;
                }
                if (PW.charAt(i) >= '0' && PW.charAt(i) <= '9') {
                    digit += 1;
                }
                for (char special : specialChar) {
                    if (PW.contains(String.valueOf(special))) {
                        specialCharCount += 1;
                        break;
                    }
                }
            }

            //calculate the strength score of password
            if (lowerCase > 0) {
                counter += 1;
            }
            if (upperCase > 0) {
                counter += 1;
            }

            if (specialCharCount > 0) {
                counter += 1;
            }

            if (PW.length() >= 8) {
                subcounter += 1;
            }

            if (digit > 0) {
                subcounter += 1;
            }

            System.out.print("Strength of password : ");
            //determine the strength of the password
            if (counter + subcounter == 5) {
                System.out.println("Strong");
            } else if (counter + subcounter == 4 && counter > subcounter) {
                if (PW.length() >= 6) {
                    System.out.println("Moderate");
                } else {
                    System.out.println("Weak");
                }
            } else if (counter + subcounter == 4 && counter == subcounter) {
                System.out.println("Weak");
            }
            if (counter + subcounter == 3) {
                if (PW.length() >= 6 && counter >= 3) {
                    System.out.println("Moderate");
                } else {
                    System.out.println("Weak");
                }
            } else if (counter + subcounter < 3) {
                System.out.println("Weak");
            }
        }
    }
}
