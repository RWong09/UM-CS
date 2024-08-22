package l8;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class WeightCalculator {
    public int age;
    public double height;
    public double RecWeight;

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your age: ");
        age=sc.nextInt();
        System.out.print("Please enter your height(in cm): ");
        height=sc.nextInt();
    }
    
    public void RecWeight(){
        Scanner sc=new Scanner(System.in);
        RecWeight=(height-100+(age/10))*0.9;
        System.out.println("Your age is: "+age);
        System.out.println("Your height is: "+height);
        System.out.printf("Your recommend weight is: %.2f\n",RecWeight);
    }
}
