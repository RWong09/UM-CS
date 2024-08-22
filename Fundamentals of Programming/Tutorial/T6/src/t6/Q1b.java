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
public class Q1b {
    public static void main(String[] args) {
        //Q1b) A method to determine a square number
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int a=sc.nextInt();
        square(a);
    }
    
    public static void square(int x){
        boolean sq=false;
        for(int b=1;b<x;b++){
        if(x/b==b && x%b==0){
        System.out.println(x+" is a square number.");
        sq=true;
        break;
            }  
        }
        if(sq==false)
            System.out.println(x+" is not a square number.");
    }
}
