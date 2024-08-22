/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q1e {
    public static void main(String[] args) {
        //1e)Determine the number of digits and letters in a String
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a parameter: ");
        String ld=sc.nextLine();
        Character(ld);
    }
    
    public static void Character(String a){
        int charac=0,digit=0,special=0;
        for(int x=0;x<a.length();x++){
            if(a.charAt(x)>='a' && a.charAt(x)<='z'){
                charac++;
            }
            else if(a.charAt(x)>='A' && a.charAt(x)<='Z'){
                charac++;
            }
            else if(a.charAt(x)>='0' && a.charAt(x)<='9'){
                digit++;
            }
            else
                special++;
        }
        System.out.println("The number of letters is: "+charac);
        System.out.println("The number of digits is: "+digit);
    }
}
