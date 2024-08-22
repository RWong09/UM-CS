/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class L2Q6 {
    public static void main(String[] args) {
        //Q6: Calculate the energy needed to heat water
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double m=sc.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double it=sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double ft=sc.nextDouble();
        double iT=(it-32)/1.8;
        double fT=(ft-32)/1.8;
        double M=m/1000;
        double Q=M*(fT-iT)*4184;
        System.out.printf("The energy needed is: %e\n",Q);
    }
    
}
