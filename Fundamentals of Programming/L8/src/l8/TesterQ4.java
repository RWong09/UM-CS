/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l8;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TesterQ4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Fraction f = new Fraction();
        System.out.print("Enter a numerator: ");
        int num=sc.nextInt();
        f.setNumerator(num);
        System.out.print("Enter a denominator: ");
        int den=sc.nextInt();
        f.setDenominator(den);
        f.simplestForm(f.getNumerator(),f.getDenominator());
        }
}
