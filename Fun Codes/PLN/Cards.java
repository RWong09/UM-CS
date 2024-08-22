/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLN;
import java.util.Arrays;
import java.util.Scanner;
 
public class Cards{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] cards = new int[n][2];
 
        for (int i = 0; i < n; i++) {
            cards[i][0] = scanner.nextInt();
            cards[i][1] = scanner.nextInt();
        }
 
        Arrays.sort(cards, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1]; // Sort by breadth in descending order if lengths are equal
            } else {
                return a[0] - b[0]; // Sort by length in ascending order
            }
        });
 
        int[] lis = new int[n];
        int maxCards = 0;
 
        for (int[] card : cards) {
            int index = Arrays.binarySearch(lis, 0, maxCards, card[1]);
            if (index < 0) {
                index = -(index + 1);
            }
            lis[index] = card[1];
            if (index == maxCards) {
                maxCards++;
            }
        }
 
        System.out.println(maxCards);
    }
}