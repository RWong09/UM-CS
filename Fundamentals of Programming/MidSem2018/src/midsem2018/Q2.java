/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midsem2018;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        //Q2:The final score
        int m,sum=0,n=0;
        Scanner son=new Scanner(System.in);
        do{
        System.out.print("Enter a number (-1 to quit): ");
        m=son.nextInt();
        if(m==-1)
        break;
        n++;
        System.out.print("Enter a factor: ");
        int f=son.nextInt();
        System.out.print(m+" is a factor of "+f+"? (true/false): ");
        Boolean t=son.nextBoolean();
        if((m%f==0)== t){
        System.out.println("Your answer is correct.");
        sum++;
        }
        else
        System.out.println("Your answer is incorrect.");
        }while(!(m==-1));
        System.out.println("The final score is: "+sum+"/"+n);
    }
}
