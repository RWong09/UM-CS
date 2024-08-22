/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5;

/**
 *
 * @author HP
 */
public class Q5 {
    public static void main(String[] args) {
        //Q5:Reverse the string in the array
        String[]sentence={"It","is","not","easy","to","learn","computer","science."};
        for(int i=sentence.length-1;i>=0;i--)
        {String word=sentence[i];
        for(int j=word.length()-1;j>=0;j--)
        System.out.print(word.charAt(j));
        System.out.print(" ");
        } 
        System.out.println();
    }    
}
