/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        String word=cs.nextLine();
        for(int i=word.length()-1;i>=0;i--){
        System.out.print(word.charAt(i));
        }
        System.out.printf("\n");
    }
}
