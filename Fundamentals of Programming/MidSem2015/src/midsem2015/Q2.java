/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midsem2015;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q2 {
        public static void main(String[] args) {
        Scanner dr=new Scanner(System.in);
        String durian;
        double sales;
        double total=0.0;
        do{
        System.out.print("Enter the type of durian [Quit] to terminate: ");
        durian=dr.nextLine();
        if(durian.equals("Quit"))
        break;
        System.out.print("Enter the sales in kg: ");
        sales=dr.nextDouble();
        dr.nextLine();
        if(durian.equals("MK"))
        total+=sales*25;
        else if(durian.equals("HL"))
        total+=sales*22;
        else if(durian.equals("D24"))
        total+=sales*20;
        else if(durian.equals("UM"))
        total+=sales*18;
        }while(!durian.equals("Quit"));
        System.out.printf("Total sales: %.2f\n",total);
    }
}
