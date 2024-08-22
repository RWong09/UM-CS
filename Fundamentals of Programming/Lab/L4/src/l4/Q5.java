/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l4;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q5 {
    public static void main(String[] args) {
        Random d=new Random();
        int a,b,tot1,tot2;
        tot1=0;
        tot2=0;
        System.out.println("Let's start the game!");
        while(tot1<=100&&tot2<=100){
        System.out.println("It's player 1's turn!");
        a=d.nextInt(6)+1;
        System.out.println(a);
        tot1 +=a;
        while(a==6){
        System.out.println("Bonus!");
        a=d.nextInt(6)+1;
        System.out.println(a);
        tot1 +=a;        
        }
        System.out.println("The total for player 1 is: "+tot1);
        if(tot1>100)
        break;
        System.out.println("It's player 2's turn!");
        b=d.nextInt(6)+1;
        System.out.println(b);
        tot2 +=b;
        while(b==6){
        System.out.println("Bonus!");
        b=d.nextInt(6)+1;
        System.out.println(b);
        tot2 +=b;        
        }
        System.out.println("The total for player 2 is: "+tot2);
        }
        if(tot1>100)
        System.out.println("Player 1 wins!");
        else if(tot2>100)
        System.out.println("Player 2 wins!");
    }    
}
