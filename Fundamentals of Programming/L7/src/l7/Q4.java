/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l7;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        //Q4
        try{
            Scanner read=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\lecturer.txt"));
            int line=0,wordnum=0,charac=0;
            while(read.hasNextLine()){
                String Linenum=read.nextLine();
                line++;
                
                String[] words=Linenum.split("\\s+");
                wordnum+=words.length;
                
                for(String word: words)
                    charac+=word.length();
            }
            System.out.println("The number of lines in .txt file is: "+line);
            System.out.println("The number of words in .txt file is: "+wordnum);
            System.out.println("The number of characters in .txt file is: "+charac);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}
