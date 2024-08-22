/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l7;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        //Q3
        File rev=new File("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\reverse.txt");
        try{
            if(rev.createNewFile()){
                System.out.println("File created: "+rev.getName());
            }
            else
                System.out.println("File has already created.");
            Reverse();
        }
        catch(IOException e){
            System.out.println("IO error: "+e.getMessage());
        }
    }
    
    static void Reverse(){
        try{
            Scanner sc=new Scanner(System.in);
            PrintWriter r=new PrintWriter(new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\reverse.txt"));
            String a=sc.nextLine();
            for(int i=a.length()-1;i>=0;i--){
                r.print(a.charAt(i));
            }
            r.close();
            Scanner out=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\reverse.txt"));
            while(out.hasNextLine()){
                String data=out.nextLine();
                System.out.println(data);
            }
            out.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}
