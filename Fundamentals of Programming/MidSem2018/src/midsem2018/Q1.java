/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midsem2018;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1:Simulate the situations for N staff
        Random s=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number of staff [N] : ");
        int N=sc.nextInt();
        int sum=0;
        for(int n=1;n<=N;n++){
        int st=s.nextInt(90000)+10000;
        System.out.println("Staff ID: "+st);   
        if((st%10000/1000)%2==1 && (st%100/10)%2==0){
        System.out.println("Weekend Duty");
        sum++;
        }
        else
        System.out.println("Weekend Off");
        }
        System.out.println("The number of staffs work during the weekend is "+sum);
        
    }
    
}
