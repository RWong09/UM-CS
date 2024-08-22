/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q1g {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double a=sc.nextDouble();
        Radius(a);
    }
    
    public static void Radius(double r){
        double area=Math.PI*r*r;
        System.out.printf("The area of the circle(cm) is: "+"%.2f",area);
        System.out.println();
        double cir=Math.PI*2*r;
        System.out.printf("The circumference of the circle(cm) is: "+"%.2f",cir);
        System.out.println();
    }
}
