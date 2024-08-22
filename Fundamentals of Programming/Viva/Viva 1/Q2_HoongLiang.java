/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva_group;

import java.util.Scanner;
public class Q2_HoongLiang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int in = sc.nextInt();
        System.out.print("Reversed integer: ");

        if (in > 0) {
            for (int IN = in; IN > 0; IN /= 10) {
                System.out.print(IN % 10);
            }
        } else if (in == 0) {
            System.out.print(0);
        } else {
            System.out.print("-");
            for (int IN = in * -1; IN > 0; IN /= 10) {
                System.out.print(IN % 10);
            }
        }
        System.out.println();
    }
}
