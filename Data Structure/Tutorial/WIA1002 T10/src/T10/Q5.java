/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T10;

/**
 *
 * @author HP
 */
public class Q5 {
    public static void main(String[] args) {
        printDigit(4567);
        System.out.println();
    }
    
    static void printDigit(int n){
        if(n==0)
            return;
        else
            printDigit(n/10);
            System.out.print(n%10+" ");
    }
}
