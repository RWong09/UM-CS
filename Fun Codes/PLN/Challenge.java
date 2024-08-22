/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLN;
import java.util.Scanner;
 
public class Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] answer = new int[T];
 
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
 
            if (a < b) {
                answer[i] = GCD(b, a);
            } else {
                answer[i] = GCD(a, b);
            }
        }
 
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
 
    private static int GCD(int a, int b) {
        while (a != 0) {
            if (a % b == 0) {
                break;
            }
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }
}
