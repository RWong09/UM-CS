/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q5 {
    public static void main(String[] args) {
        //Q5:Compare the performance of linear search and binary search
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("A list of 20 random integer within 0 to 100");
        
        int[]num=new int[20];
        for(int n=0;n<num.length;n++){
        num[n]=r.nextInt(101);
        }
        
        for(int n=0;n<num.length-1;n++)
        System.out.print(num[n]+", ");
        System.out.println(num[19]);
        
        for(int pass=1;pass<20;pass++)
            for(int n=0;n<19;n++)
                if(num[n]<num[n+1]){
                int num1=num[n];
                num[n]=num[n+1];
                num[n+1]=num1;
                }
        
        System.out.println("Array in descending order");
        for(int n=0;n<num.length-1;n++)
            System.out.print(num[n]+", ");
            System.out.println(num[num.length-1]);
        
        System.out.print("Enter a number to search: ");
        int key=sc.nextInt();
        
        boolean search=false;
        for(int k=0;k<num.length;k++){
            if(num[k]==key){
                System.out.println(key+" found");
                int s=k+1;
                System.out.println("Linear search - "+s+" loop(s)");
                search=true;
                break;
            }
        }
        if(!search)
            System.out.println(key+" not found");
        
        boolean search2=false;
        int low=0;
        int high=num.length-1;
        int middle,m=0;
        while(low<=high){
            middle=(low+high)/2;
            if(key==num[middle]){
                m++;
                System.out.println(key+" found");
                System.out.println("Binary search - "+m+" loop(s)");
                search2=true;
                break; 
            }
            else if(key>num[middle]){
                m++;
                high=middle-1;    
            }
            
            else{
                m++;
                low=middle+1;
            }
        }
        if(!search2)
            System.out.println(key+" not found");
    }
}
