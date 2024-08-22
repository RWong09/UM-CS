/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLN;
import java.util.Scanner;
 
public class Traveling{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
 
        String[] s = new String[t];
 
        if( t > 0 && t <= 1000){
            for (int i = 0; i < t; i++) {
                int px = scanner.nextInt();
                int py = scanner.nextInt();
                scanner.nextLine();
                String line = scanner.nextLine();
                for (char instruction : line.toCharArray()) {
                    switch (instruction) {
                        case 'U':
                            if(py > 0){
                                py--;
                            }
                            break;
                        case 'D':
                            if(py < 0){
                                py++;
                            }
                            break;
                        case 'R':
                            if(px > 0){
                                px--;
                            }
                            break;
                        case 'L':
                            if(px < 0){
                                px++;
                            }
 
                            break;
                    }
                }
                boolean possible = (px == 0) && (py == 0);
 
                // Print the result
                System.out.println(possible ? "YES" : "NO");
 
            }
        }else{
            System.out.println("Error");
        }
    }
}
