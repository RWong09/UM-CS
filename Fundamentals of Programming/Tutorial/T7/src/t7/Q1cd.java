/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t7;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import static t7.Q1ab.R;
/**
 *
 * @author HP
 */
public class Q1cd {
    public static void main(String[] args) {
        //1c)
        File ints=new File("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\T7 file\\integer.dat");
        try{
            if(ints.createNewFile()){
                System.out.println("File successfully created: "+ints.getName());
            }
            else{
                System.out.println("File already exists.");
            }
            
        //1d)
            PrintWriter t=new PrintWriter("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\T7 file\\integer.dat");
            int[] p=R();
            for (int i = 0; i < p.length; i++)
                t.print(Integer.toString(p[i]) + " ");
            t.close();
            System.out.println("Successfully wrote to the file.");
            
            Scanner sc=new Scanner(ints);
            double average=0;
            int i=0;
            System.out.println("The output of the file is as follows: ");
            while(sc.hasNext()){
                int data = Integer.parseInt(sc.next()); 
                    average+=data;
                    i++;
                System.out.print(data+" ");
            }
            System.out.println();
            average/=i;
            System.out.printf("The average of the random integer generated is: %.2f",average);
            System.out.println();
        }
        catch(IOException e){
            System.out.println("Error occurred.");
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
