/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q1f {
    public static void main(String[] args) {
        //1f)Access the numbers from the main method
        Random r=new Random();
        int[] a=new int[10];
        for(int x=0;x<a.length;x++){
            a[x]=r.nextInt(101);
        }
        Num(a);
    }
    
    public static void Num(int[] r){
        for(int x=0;x<r.length;x++){
            System.out.print(r[x]+" ");
        }
        System.out.println();
    }
}
