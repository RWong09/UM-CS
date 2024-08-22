/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l6;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q5 {
    public static void main(String[] args) {
        multiply();
    }
    
    static void multiply(){
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        boolean ans;
        int score=0;
        do{
        int p=r.nextInt(13);
        int q=r.nextInt(13);
        System.out.println("Enter negative number to quit:");
        System.out.print(p+" x "+q+" = ");
        int s=sc.nextInt();
        if(s<0){
            System.out.println("The score is "+score);
            break;
        }
        if(p*q==s){
            score++;
        }
        }while(ans=true);
    }
}
