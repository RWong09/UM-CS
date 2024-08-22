/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l8;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TesterQ2 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        Scanner sc = new Scanner(System.in);
        ba.BankAccountRegistration();
        boolean status = true;
        System.out.println("Welcome! " + ba.getName());
        while (status) {
            System.out.printf("1. Deposit\n2. WithDrawal");
            System.out.println();
            System.out.print("Enter your choice: ");
            int input1 = sc.nextInt();
            if (input1 == 1) {
                ba.deposit();
                System.out.println("Do you want to continue? ");
                System.out.printf("1. Yes\n2. No");
                System.out.println();
                System.out.print("Enter your choice: ");
                int input2 = sc.nextInt();
                if (input2 == 1) {
                    continue;
                } else if (input2 == 2) {
                    System.out.printf("Your current balance is: %.2f", ba.getcurrentBalance());
                    System.out.println();
                    status = false;
                } else {
                    System.out.println("Invalid choice!");
                }
            } 
            else if (input1 == 2) {
                ba.withdraw();
                System.out.println("Do you want to continue?: ");
                System.out.printf("1. Yes\n2. No");
                System.out.println();
                System.out.print("Enter your choice: ");
                int input3 = sc.nextInt();
                if (input3 == 1) {
                    continue;
                } else if (input3 == 2) {
                    System.out.printf("Your current balance is: %.2f", ba.getcurrentBalance());
                    System.out.println();
                    status = false;
                }
            }
            else{
                System.out.println("Invalid choice!");
            }
        }
    }
}
