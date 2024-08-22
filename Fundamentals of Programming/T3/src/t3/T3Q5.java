/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t3;

/**
 *
 * @author HP
 */
public class T3Q5 {
    public static void main(String[] args) {
        //Determine a Leap year
        int year=2023;
        if(year%4==0 ||year%400==0)
            System.out.println(year+" is a leap year.");
        else
            System.out.println(year+" is not a leap year.");
    }
}
