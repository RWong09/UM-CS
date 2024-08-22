/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l7;
import java.io.*;
/**
 *
 * @author HP
 */
public class Q5 {
    public static void main(String[] args) {
        //Q5
        try{
            ObjectInputStream info=new ObjectInputStream(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\person.dat"));
            
            int numofrec=info.readInt();
            String[] name=new String[numofrec];
            int[] age=new int[numofrec];
            char[] gender=new char[numofrec];
            
            for(int i=0;i<numofrec;i++){
                name[i]=info.readUTF();
                age[i]=info.readInt();
                gender[i]=info.readChar();
            }
            
            System.out.println("Before:");
            print(name,age,gender);
            
            sort(name,age,gender);
            
            System.out.println("After:");
            print(name,age,gender);
            
            info.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch(IOException e){
            System.out.println("IO error: "+e.getMessage());
        }
    }
    
    static void print(String[] name,int[] age, char[] gender){
        System.out.printf("%-20s%-20s%-10s\n", "Name", "Age", "Gender");
        for(int i=0;i<name.length;i++){
            System.out.printf("%-20s%-20s%-10s\n", name[i],age[i],gender[i]);
        }
        System.out.println();
    }
    
    static void sort(String[] name, int[] age, char[] gender){
        for(int i=1;i<name.length;i++){
            for(int k=0;k<name.length-1;k++){
                if(name[k].compareTo(name[k+1])>0){
                    String a=name[k];
                    name[k]=name[k+1];
                    name[k+1]=a;
                    
                    int b=age[k];
                    age[k]=age[k+1];
                    age[k+1]=b;
                    
                    char c=gender[k];
                    gender[k]=gender[k+1];
                    gender[k+1]=c;
                }
            }
        }
    }
}
