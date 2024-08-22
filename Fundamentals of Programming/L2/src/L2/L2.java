/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L2;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author HP
 */
public class L2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1: Fahrenheit to Celsius
        Scanner sc= new Scanner(System.in);
        double f,c;
        System.out.print("Enter the temperature in Fahrenheit: ");
        f=sc.nextDouble();
        c=(f-32)/1.8;
        System.out.printf("The temperature in Celsius is: %.2f\n",c);
        
        //Q2: Monthly payment for car loan
        double p,d,r,y,m;
        System.out.print("Enter the price of the car: ");
        p=sc.nextDouble();
        System.out.print("Enter your down payment: ");
        d=sc.nextDouble();
        System.out.print("Enter the interest rate(%): ");
        r=sc.nextDouble();
        System.out.print("Enter your loan duration in year: ");
        y=sc.nextDouble();
        m=(p-d)*(1+r*y/100)/(y*12);
        System.out.printf("Your monthly payment is: %.2f\n",m);
        
        //Q3: Generate random numbers
        Random a= new Random();
        int num1,num2,num3;
        int MAX= 41;
        num1= 10+ a.nextInt(MAX);
        num2= 10+ a.nextInt(MAX);
        num3= 10+ a.nextInt(MAX);
        int sum=num1+num2+num3;
        System.out.println(num1+","+num2+","+num3);
        System.out.println("The sum of the number is: "+sum);
        System.out.println("The average of the number is: "+sum/3);
        

    }
    
}
