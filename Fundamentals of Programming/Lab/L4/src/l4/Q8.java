/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l4;

import java.util.Random;

/**
 *
 * @author HP
 */
public class Q8 {

    public static void main(String[] args) {
        Random n = new Random();
        int a = n.nextInt(101);
        System.out.println("The first " + a + " prime number");
        for (int i = 1, num = 2; i <= a; num++) {
            if (num % 2 == 1) {
                for (int d = 2; d <= num ; d++) {
                    if (num == d) {
                        i++;
                        System.out.print(num + ",");
                    } else if (num % d == 0) {
                        break;
                    }
                }

            } else if (num == 2) {
                System.out.print(num + ",");
                i++;
            }
        }
        System.out.println();
    }
}
