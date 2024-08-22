/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l5;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1:Display the highest,the lowest and the average score
        Scanner sc=new Scanner(System.in);
        Random num=new Random();
        int h=0,l=100;
        double sum=0,a=0;
        System.out.print("Please enter the number of students: ");
        int N=sc.nextInt();
        int[]score=new int[N];
        System.out.println("The scores of the students are as follows:");
        for(int m=0;m<score.length;m++){
            score[m]=num.nextInt(101);
            System.out.print(score[m]+" ");
        }
        for(int m=0;m<score.length;m++){
            if(score[m]>h)
            h=score[m];
            if(score[m]<l)
            l=score[m];
            sum+=score[m];
        }
        a=sum/N;
        System.out.println();
        System.out.println("The highest score is: "+h);
        System.out.println("The lowest score is: "+l);
        System.out.printf("The average score is: %.2f\n",a);
    }
    
}
