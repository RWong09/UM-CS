/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class L3Q3 {
    public static void main(String[] args) {
        //Q3:Calculate total commission receives
        double sales,commission;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        sales=sc.nextDouble();
        
        if(sales<=100)
        {commission=sales*0.05;
        System.out.println("The commission is: "+commission);        
        }
        
        if(sales>100 && sales<=500)
        {commission=sales*0.075;
        System.out.println("The commission is: "+commission);        
        } 
        
        if(sales>500 && sales<=1000)
        {commission=sales*0.1;
        System.out.println("The commission is: "+commission);        
        } 
        
        if(sales>1000)
        {commission=sales*0.125;
        System.out.println("The commission is: "+commission);        
        } 
    }
}
