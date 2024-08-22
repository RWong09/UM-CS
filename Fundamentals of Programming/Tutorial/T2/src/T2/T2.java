/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1: Print FCSIT
        System.out.print("Faculty");
        System.out.print(" of");
        System.out.print(" Computer");
        System.out.print(" Science");
        System.out.print(" and");
        System.out.print(" Information");
        System.out.print(" Technology\n");
        
        System.out.println("Faculty\nof\nComputer\nScience\nand\nInformation\nTechnology");
        
        //Q2: Print SDN
        System.out.println("\"SDN\" - Software-defined Networking");
        
        //Q3: Error
        System.out.println("Java Programming");
        System.out.println("Introduction to Java!");
        System.out.println("\\t is the horizontal tab character");
        System.out.println("Java is case sensitive!");
        
        //Q4: Writing statements
        String matric1=("23053016");
        String matric2=("23003179");
        System.out.println(matric1+","+matric2);
        double pi=Math.PI;
        System.out.println(pi);
        boolean M=false;
        System.out.println(M);
        long P=8800000000L;
        System.out.println(P);
        char Letter='U';
        System.out.println(Letter);
        final String PRO= "Java";
        System.out.println(PRO);
        
        //Q5: Correct the error
        double AMOUNT = 32.5;
        AMOUNT += 10;
        System.out.println("The amount is " + AMOUNT);
        String chapter = "Summary";
        System.out.println(chapter);
        int num=39;
        num++;
        int num1 = num;
        System.out.println(num1);
        int num2= 3000;
        System.out.printf("%4d\n", num2);
        String contact;
        Scanner keyboard = new Scanner(System.in);
        contact= keyboard.nextLine();
        
        //Q6: Print the circumference
        Scanner input= new Scanner(System.in);
        double diameter,circumference;
        System.out.printf("Enter diameter: ");
        diameter=input.nextDouble();
        circumference= Math.PI*diameter;
        System.out.printf("The circumference of the circle is: %.3f\n",circumference);
        
        //Q7: Inches to meters
        Scanner input2= new Scanner(System.in);
        double inches,meters;
        System.out.print("Enter value in inch: ");
        inches=input2.nextDouble();
        meters=2.54/100*inches;
        System.out.printf(inches+" inches="+"%.2f meters\n",meters);

    }
    
}
