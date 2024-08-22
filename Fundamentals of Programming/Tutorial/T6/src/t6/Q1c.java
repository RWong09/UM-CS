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
public class Q1c {
    public static void main(String[] args) {
        //1c)A static method that use to compute combination function C
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter integer n and k respectively: ");
        a=sc.nextInt();
        b=sc.nextInt();
        C(a,b);
    }
    
    public static void C(int n,int k){
        int f1=1,f2=1,f3=1,d;
        d=n-k;
        for(int m=1;m<=n;m++){
            f1*=m;
        }
        for(int m=1;m<=k;m++){
            f2*=m;
        }
        for(int m=1;m<=d;m++){
            f3*=m;
        }
        int C=f1/(f2*f3);
        System.out.println("The answer for function C is: "+C);
    }
}
