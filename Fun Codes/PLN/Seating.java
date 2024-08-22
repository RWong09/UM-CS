/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLN;
import java.util.Scanner;

public class Seating{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int count =0;
 
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            count = a;
 
            if(b >= 3){
                count = count + (b/3);
                b =b%3;
                
            }
            if(b != 0){
                if(c == 0 || (c == 1 && b == 1)){
                    count = -1;
                }else{
                    if(b == 1){
                        c = c - 2;
                    }else if(b == 2) {
                        c = c - 1;
                    }
                    count = count + 1;
                    count = count + c/3;
 
                    if(c%3 != 0){
 
                        count = count + 1;
                    }
                }
 
            }else{
                count = count + c/3;
                if(c%3 != 0){
                    count = count + 1;
                }
            }
 
            System.out.println(count);
        }
 
        scanner.close();
    }
}

