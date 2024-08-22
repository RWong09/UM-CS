/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l6;

/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        EM(24,8);
        EM(625,200);
        int a=24;
        int b=8;
        int c=625;
        int d=200;
        System.out.print("The GCD for ("+a+","+b+") is: "+EM(24,8));
        System.out.println();
        System.out.print("The GCD for ("+d+","+c+") is: "+EM(625,200));
        System.out.println();
    }
    
    static int EM(int a, int b){
        int c=a%b;
        if(c!=0)
            return EM(b,c);
        else
            return b;
    }
}
