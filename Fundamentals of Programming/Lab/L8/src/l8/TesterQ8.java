/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l8;
import java.util.Random;
/**
 *
 * @author HP
 */
public class TesterQ8 {
    public static void main(String[] args) {
        Random r=new Random();
        double money1=r.nextDouble()*1000;
        money1=Math.round(money1 * 100) / 100.0;
        System.out.printf("Money 1: %.2f\n",money1);
        Money first=new Money(money1);
        System.out.println("First money: ");
        System.out.println(first);
        System.out.println();
        
        double money2 = r.nextDouble() * 1000;
        money2 = Math.round(money2 * 100) / 100.0;
        System.out.printf("Money 2: %.2f\n", money2);
        Money second = new Money(money2);
        System.out.println("Second Money:");
        System.out.println(second);
        System.out.println();

        System.out.println("Second Money Subtract First Money:");
        second.minus(first);
        System.out.println(second);
        System.out.println();

        System.out.println("First Money Add Second Money:");
        first.add(second);
        System.out.println(first);        
    }
}
