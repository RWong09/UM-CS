/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l4;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=sc.nextInt();
        System.out.print("Enter the first day of the year: ");
        int day=sc.nextInt();
        
        if(year%4==0)
            day++;
        
        day=(day+120)%7;
        
        System.out.println();
        System.out.println("May");
        System.out.println("  S  M  T  W  T  F  S");
        System.out.print(" ".repeat(3 * day));
        
        for(int d=1;d<=31;day++,d++){
        System.out.printf("%3d",d);
        if(day%7==6)
        System.out.println();
        }
        System.out.println();
        
        day=(day+61)%7;
        System.out.println();
        System.out.println("August");
        System.out.println("  S  M  T  W  T  F  S");  
        System.out.print(" ".repeat(3 * day));
        for(int d=1;d<=31;day++,d++){
        System.out.printf("%3d",d);
        if(day%7==6)
        System.out.println();
        }
        System.out.println();        
    }
}
