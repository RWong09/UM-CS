/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        //Q2:Generate 10 non-duplicate random integers        
        Random i=new Random();
        int[]store=new int[10];
        for(int j=0;j<store.length;j++){
            store[j]=i.nextInt(21);
            for(int k=0;k<j;k++){
                if(store[j]==store[k]){
                    store[j]=i.nextInt(21);
                    k=0;
                }
            }
            System.out.print(store[j]+" ");
            }
        System.out.println();
    }
}
