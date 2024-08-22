/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLN;
import java.util.Scanner;
import java.util.Stack;
 
public class PseudocodeSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int l = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        String[] commands = new String[l];
        for (int i = 0; i < l; i++) {
            commands[i] = scanner.nextLine().trim();
        }
        
        final long maxInt = (long) Math.pow(2, 32) - 1;
        long x = 0;
        long multiplier = 1; // Initialize multiplier
        
        Stack<Long> loopMultipliers = new Stack<>();
        
        for (String command : commands) {
            if (command.startsWith("for")) {
                int n = Integer.parseInt(command.split(" ")[1]);
                loopMultipliers.push(multiplier); // Save current multiplier for this loop
                multiplier *= n; // Update multiplier for nested loops
            } else if (command.equals("end")) {
                multiplier = loopMultipliers.pop(); // Restore multiplier for previous loop
            } else if (command.equals("add")) {
                x += multiplier;
                if (x > maxInt) {
                    System.out.println("OVERFLOW!!!");
                    return;
                }
            }
        }
        
        System.out.println(x);
        scanner.close();
    }
}
