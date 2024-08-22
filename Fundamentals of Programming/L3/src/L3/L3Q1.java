/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //A simple calculator
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two integer numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.print("Enter the operand:");
        String input=sc.next();
        char operand=input.charAt(0);
        int ans;
        if(operand=='+')
        {ans=num1+num2;
        System.out.println("The answer is: "+ans);}
        if(operand=='-')
        {ans=num1-num2;
        System.out.println("The answer is: "+ans);}
        if(operand=='*')
        {ans=num1*num2;
        System.out.println("The answer is: "+ans);}
        if(operand=='/')
        {ans=num1/num2;
        System.out.println("The answer is: "+ans);}
    }
    
}
