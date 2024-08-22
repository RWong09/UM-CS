/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class T3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a)Determine whether 3*8=27
        if(3*8==27)
            System.out.println("3*8=27 is true");
        else
            System.out.println("3*8=27 is false");
        
        //b)Determine whether an input integer is an odd number or even number
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter an integer:");
        int integer=sc.nextInt();
        if(integer%2==1)
            System.out.println("The integer is an odd number.");
        else
            System.out.println("The integer is an even number.");
        
        //c)Determine whether a character is a capital letter
        System.out.print("Please enter a character:");
        char A=sc.next().charAt(0);
        if(A>='A'&&A<='Z')
            System.out.println(A+" is capital letter.");
        else
            System.out.println(A+" is not capital letter.");
        
        //d)Display two strings in alphabetical order ignoring their case
        String name1="Hi";
        String name2="nice";
        if(name1.compareToIgnoreCase(name2)<0)
            System.out.println(name1+" "+name2);
        else
            System.out.println(name2+" "+name1);
        
        /*e)A switch statement that display Sunday, Monday, .., Satudary if the input is 0,
         *1, …, 6
         */
        int day=5;
        switch(day){
            case 0:System.out.println("Sunday");
            break;
            case 1:System.out.println("Monday");
            break;
            case 2:System.out.println("Tuesday");
            break;
            case 3:System.out.println("Wednesday");
            break;
            case 4:System.out.println("Thursday");
            break;
            case 5:System.out.println("Friday");
            break;
            case 6:System.out.println("Saturday");
            break;
            default: System.out.println("Out of the range");
            break;
        }
    }
    
}
