/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLN;
import java.util.*;
/**
 *
 * @author HP
 */
public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b;
            int result = 0;
            while(true){
                b=a%10;
                a = a/10;
                if(result < b){
                    result=b;
                }
                if(a == 0){
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
