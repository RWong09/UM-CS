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
public class Fraction {
        
    protected int numerator;
    protected int denominator;
    protected int GCF;
    
    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setNumerator(int numerator) {
        this.numerator =  numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void simplestForm(int a, int b) {
        GCF = GCF(a,b);
        System.out.println("Lowest Term: " + (numerator / GCF) + "/" + (denominator / GCF));
    }
    
    private static int GCF(int x, int y) {
        if(x == y) {
            return x;
        }
        if (x > y) {
            for (int i = y; i > 0; i--) {
                if (x % i == 0 && y % i == 0) {
                    return i;
                }
            }
        }else if (y > x) {
            for (int i = x; i > 0; i--) {
                if (x % i == 0 && y % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
}
