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
public class Q7 {
    public static void main(String[] args) {
        Scanner pr=new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double P1=pr.nextDouble();
        System.out.print("Enter interest in %: ");
        double in=pr.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double mon=pr.nextDouble();
        System.out.printf("Month%1$sMonthly Payment%1$sPrincipal%1$sInterest%1$sUnpaid Balance%1$sTotal Interest\n", " ".repeat(6));
        
        double M=(P1*(in/1200))/(1-(Math.pow(1+(in/1200), -mon)));
        double ti=0;
        
        for(int n=1;n<=mon;n++){
            double C=M*(Math.pow(1+in/1200, -1-mon+n));
            double L=M-C;
            double R=(L/(in/1200))-C;
            ti+=L;
            System.out.printf("%-5d%21.2f%15.2f%14.2f%20.2f%20.2f\n",n,M,C,L,R,ti);
        }
    }    
}
