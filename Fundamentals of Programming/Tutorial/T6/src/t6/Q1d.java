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
public class Q1d {
    public static void main(String[] args) {
        //1d)Determine a pentagonal number
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a parameter: ");
        int a=sc.nextInt();
        Pentagon(a);
    }    
    
    public static void Pentagon(int x){
        boolean p=false;
        double d;
        for(int n=1;n<=10000;n++){
            d=(n/2)*(3*n-1);
            if(x==(int)d || x==(n*(3*n-1))/2){
                p=true;
                System.out.println(x+" is a pentagonal number.");
                break;
            }
        }
        if(p==false)
            System.out.println(x+" is not a pentagonal number.");
    }
}
