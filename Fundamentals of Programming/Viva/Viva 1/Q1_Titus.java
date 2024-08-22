/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva_group;

/**
 *
 * @author MH Soon
 */
public class Q1_Titus {
    public static void main(String[] args) {
         for (int row = 1; row <= 5; row++) {
            System.out.print(" ".repeat(5 - row)); //create the spce each row 
            for (int i = row; i > 1; i--) { //as 1 already at second for loop
                System.out.print(i);        //for the condition is more than 1
            }                               //use i-- because lastly we need to read from 5 to 2
            for (int j = 1; j <= row; j++) { //produce the  1
                System.out.print(j);         //             12
            }                                //             123
            System.out.println();            //             1234
        }                                    //             12345
    }
}
