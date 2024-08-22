/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4;
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
        //Q1: Write statements for each of the following
        //a)Find the largest integer n
        int n,m;
        m=0;
        for(n=0;m<2000;n++){
        m=n*n*n;
        System.out.println(m);
        if(m>2000)
        break;
        }
        n=n-1;
        System.out.println("The largest integer of n is: "+n);
        
        //b)Display the square number
        int p,q;
        p=0;
        do{
        q=p*p;
        p++;
        System.out.println(q);
        }while(p<=12);

        //c)Display a 4-by-5 matrix
        Random r=new Random();
        int a,b,c,d,e;
        for(int u=1;u<5;u++){
        a=r.nextInt(101);
        b=r.nextInt(101);
        c=r.nextInt(101);
        d=r.nextInt(101);
        e=r.nextInt(101);
        System.out.println(a+" "+b+" "+c+" "+d+" "+e);
        }
        
        //d)Compute the sum of numbers from 1 to given number
        Scanner sc=new Scanner(System.in);
        System.out.print("Please give a number:");
        int l=sc.nextInt();
        int sum=0;
        for(int v=1;v<=l;v++){
        sum+=v;
        }
        System.out.println("The sum of the number is:"+sum);
        
        //e)Compute the sum of the series
        double sum1=0;
        for(int w=1;w<=25;w++)
        sum1+=(double)w/(25+1-w);
        System.out.printf("The sum of the series is: %.2f\n",sum1);
    }
    
}
