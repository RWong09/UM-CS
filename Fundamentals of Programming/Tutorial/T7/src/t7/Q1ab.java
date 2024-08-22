/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q1ab {
    public static void main(String[] args) {
        //1a)
        try{
            File integers=new File("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\T7 file\\integer.txt");
            if(integers.createNewFile()){
                System.out.println("File created: "+integers.getName());
            }
            else{
                System.out.println("File already exists.");
            }
            
            FileWriter t=new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\T7 file\\integer.txt");
            int[] p=R();
            for (int i = 0; i < p.length; i++)
                t.write(Integer.toString(p[i]) + " ");
            t.close();;
            System.out.println("Successfully wrote to the file.");
        
        //1b)
            Scanner sc=new Scanner(integers);
            int largest=0;
            System.out.println("The output of the file is as follows: ");
            while(sc.hasNext()){
                int data = Integer.parseInt(sc.next()); 
                if(data>largest)
                    largest=data;
                System.out.print(data+" ");
            }
            System.out.println();
            System.out.println("The largest integer is: "+largest);
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
    static int[] R(){
        Random r=new Random();
        int[] R=new int[10];
        for(int i=0;i<R.length;i++){
            R[i]=r.nextInt(1001);
        }
        return R;
    }
}
