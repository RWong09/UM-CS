/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1:Display the factors of a given number
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a=sc.nextInt();
        System.out.print("The factors are: ");
        for(int b=1;b<a;b++){
        if(a%b==0)
        System.out.print(b+",");
        }
        System.out.println(a);
    }
    
}
