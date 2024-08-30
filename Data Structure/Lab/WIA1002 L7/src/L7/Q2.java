/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L7;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        String[] inputs={"xoxo","bab","wttw","UWU","LMAO","JCLim","three","point","nine","six"};
        for(String input:inputs){
            System.out.println(input+" is palindrome: "+isPalindrome(input));
        }
    }
    
    public static boolean isPalindrome(String input){
        Queue<Character> list=new LinkedList<>();
        for(int i=0;i<input.length();i++){
            list.offer(input.charAt(i));
        }
        for(int i=input.length()-1;i>=0;i--){
            if(input.charAt(i)!=list.poll())
                return false;
        }
        return true;
    }
}
