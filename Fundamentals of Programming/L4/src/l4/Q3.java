/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l4;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,min,max,mean,std,tot,tot1,m,tot2;
        min=100;
        max=0;
        tot=0;
        tot1=0;
        m=0;
        do{
        System.out.print("Enter a score [negative score to quit]: ");
        a=sc.nextInt();
        if(a<0)
        break;
        if(a<min)
        min=a;
        if(a>max)
        max=a;
        tot +=a;
        tot1 +=a*a;
        m++;
        }while(a>=0);
        System.out.println("Minimum Score: "+min);
        System.out.println("Maximum Score: "+max);
        mean=tot/m;
        tot2=(tot1-(tot*tot)/m)/(m-1);                
        std=Math.sqrt(tot2);
        System.out.printf("Mean: %.2f\n",mean);
        System.out.printf("Standard deviation: %.2f\n",std);
    }
}
