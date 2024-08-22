/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l4;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q6 {
    public static void main(String[] args) {
        Random i=new Random();
        int num=Math.abs(i.nextInt());
        System.out.println(num);
        int digit=0;
        if(num==0){
        digit +=1;
        System.out.println("The number of digits: "+digit);
        }
        else{
        for(int n=num;n>0;n/=10){
        digit++;
        System.out.println("The number of digits: "+digit);
        }
        }
    }
}
