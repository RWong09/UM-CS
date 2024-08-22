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
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n=sc.nextInt();
        int sum=0,sum1=0;
        for(int m=1;m<=n;m++){
        sum=sum+m;
        sum1=sum1+sum;
        System.out.println(sum1);
        }
    }
}
