/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q1a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1a)A static method that returns the maximum number from 3 integer parameters
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 integers:");
        int i1=sc.nextInt();
        int i2=sc.nextInt();
        int i3=sc.nextInt();
        max(i1,i2,i3);
    }
    public static void max(int x, int y, int z){
        if(x>y&&x>z)
            System.out.println(x+" is the maximum integer.");
        else if(y>x&&y>z)
            System.out.println(y+" is the maximum integer.");
        else if(z>y&&z>x)
            System.out.println(z+" is the maximum integer.");
        else
            System.out.println("There is no maximum integer.");
    }
}
