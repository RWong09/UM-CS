/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q6 {
    public static void main(String[] args) {  
        //Q6:Convert a random number into binary and store it
        Random r=new Random();
        int num=r.nextInt(256);
        int[]binary=new int[8];
        int sum=0;
        for(int i=7;i>=0;i--){
            if(num-Math.pow(2, i)>=0){
            binary[i]=1;
            num-=binary[i]*Math.pow(2, i);
            }
            System.out.print(binary[i]);
        }
        System.out.println();
    }  
}
