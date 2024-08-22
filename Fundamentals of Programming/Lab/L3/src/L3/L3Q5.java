/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L3;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class L3Q5 {
    public static void main(String[] args) {
    //Q5:Cramer's rule
    Scanner cr=new Scanner(System.in);
    int a,b,c,d,e,f,x,y;
    System.out.print("Enter the value of a:");
    a=cr.nextInt();
    System.out.print("Enter the value of b:");
    b=cr.nextInt();
    System.out.print("Enter the value of c:");
    c=cr.nextInt();
    System.out.print("Enter the value of d:");
    d=cr.nextInt();
    System.out.print("Enter the value of e:");
    e=cr.nextInt();
    System.out.print("Enter the value of f:");
    f=cr.nextInt();
    if(a*d-b*c==0)
    System.out.println("The equation has no solution.");
    else{
    x=(e*d-b*f)/(a*d-b*c);
    y=(a*f-e*c)/(a*d-b*c);
    System.out.println("The value of x is:"+x);
    System.out.println("The value of y is:"+y);
        } 
    }
}
