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
public class Q1h {
    public static void main(String[] args) {
        
        System.out.println("The number that generate twice is: "+Num());
    }
    
    public static int Num(){
        Random r=new Random();
        int[]a=new int[11];
        while(true){
            int i=r.nextInt(11);
            if(a[i]==1)
                return i;
            else{
                a[i]=1;
            }
        }
    }
}
