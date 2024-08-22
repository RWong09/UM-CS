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
public class BankAccount {
    protected String name;
    protected String identityNumber;
    protected double currentBalance;

    public String getName() {
        return name;
    }
    
    public double getcurrentBalance(){
        return currentBalance;
    }

    public void BankAccountRegistration() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Identity Card or Passport Number: ");
        identityNumber = sc.nextLine();

        System.out.print("Enter Deposit Amount: ");
        currentBalance = sc.nextDouble();
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount that you want to deposit: ");
        double newDepositAmount = sc.nextDouble();
        currentBalance += newDepositAmount;
    }

    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount that you want to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        currentBalance -= withdrawAmount;
    }
}
