/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fun.coding.tutorial;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FunCodingTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tutorial 1: Code out FSKTM
        System.out.print("Faculty");
        System.out.print(" of");
        System.out.print(" Computer");
        System.out.print(" Science");
        System.out.print(" and");
        System.out.print(" Information");
        System.out.print(" Technology\n");
        
        //Tutorial 2:Write Statements
        Boolean M=true;
        System.out.println(M);
        char named_letter='U';
        System.out.print(named_letter);
        System.out.println("M");
        
        //Tutorial 3: If statements
        int a=80,b=40;
        if (a<40){
            System.out.println("You did not pass.");
            System.out.println("Try harder next time.");
            System.out.println("Press F to oay respect");
        }
        if (a>40);
        System.out.println("Why are you gay,nerd.");
        if (a>b)
        System.out.println("You too geng la boss");
        else
        System.out.println("Why you so geng?");
        
        //Tutorial 4:While loop
        Scanner sc=new Scanner(System.in);
        int p;
        System.out.print("Please enter a value: ");
        p=sc.nextInt();
        do
          {System.out.println("Please plus 1");
           p++;
           System.out.println("The current number is: "+p);
           if (p==20)
           System.out.println("You have reached the maximum number required.");
          }while(p<20);
        int x=0;
        while(x<10)
        {x++;
        System.out.println("The number is: "+x);
        }
        int y=8;
        do
        {y++;
        System.out.println("The number for y is: "+y);   
        }while(y<10);
        
        //Tutorial 5:For loop
        int num;
        for (num = 1; num < 5; num++)
        {
        System.out.println("Counter is " + num);
        if(num==5)
        System.out.println("Maximum capacity reached!");
        }
        
        if(true)
            System.out.println("OK");
        System.out.println("FOP PASS!!!");
        
        System.out.println(5/2);
    }
    
}
