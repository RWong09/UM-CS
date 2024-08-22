/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l8;

/**
 *
 * @author HP
 */
public class TesterQ1 {
    public static void main(String[] args) {
        Number a = new Number() ;
        Number b = new Number(5);
        Number c = new Number(4, 50);

        // Test the methods
        a.displayAllNumber();
        a.evenNumber();
        a.primeNumber();
        a.maxNumber();
        a.minNumber();
        a.average();
        a.squareNumber();

        System.out.println();

        b.displayAllNumber();
        b.evenNumber();
        b.primeNumber();
        b.maxNumber();
        b.minNumber();
        b.average();
        b.squareNumber();

        System.out.println();

        c.displayAllNumber();
        c.evenNumber();
        c.primeNumber();
        c.maxNumber();
        c.minNumber();
        c.average();
        c.squareNumber();
    }
}
