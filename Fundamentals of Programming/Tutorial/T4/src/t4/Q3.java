/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {    
        //Q3:Fibonacci sequence
        int sum1=0;
        int sum=1;
        System.out.print(sum+",");
        for(int p=1;p<9;p++){ 
        int sum2=sum+sum1;
        sum1=sum;
        sum=sum2;
        System.out.print(sum2+",");
        }
        int sum2=sum+sum1;
        System.out.println(sum2); 
    }
}
