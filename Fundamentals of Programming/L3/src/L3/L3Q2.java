/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L3;
import java.util.Random;
/**
 *
 * @author HP
 */
public class L3Q2 {
    public static void main(String[] args) {
       //Q2:Display the integer in word
       Random g=new Random();
       int num=g.nextInt(6);
       System.out.print(num+" is ");
       switch(num){
           case 0:System.out.println("zero"); break;
           case 1:System.out.println("one"); break;
           case 2:System.out.println("two"); break;
           case 3:System.out.println("three"); break;
           case 4:System.out.println("four"); break;
           case 5:System.out.println("five"); break;
       }
    }
}
