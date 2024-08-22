/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L3;
import java.util.Random;
/**
 *
 * @author HP
 */
public class L3Q4 {
    public static void main(String[] args) {
        //Q4:Roll the dice!
        System.out.println("Round 1 starts, it's player 1's turn!");
        int player=0;
        switch(player){
            case 0:System.out.println("Player 1 rolls the dice...");
            break;
            case 1:System.out.println("Player 2 rolls the dice...");
            break;
        }
        Random p=new Random();
        int p1,p2,p3,p4;
        p1=p.nextInt(6)+1;
        int sum1=p1;
        System.out.println("Player 1's score is:"+sum1);
        System.out.println("It's player 2's turn!");
        int player2=1;
        switch(player2){
            case 0:System.out.println("Player 1 rolls the dice...");
            break;
            case 1:System.out.println("Player 2 rolls the dice...");
            break;
        }
        p2=p.nextInt(6)+1;
        int sum2=p2;
        System.out.println("Player 2's score is:"+sum2);
        System.out.println("Round over! The score is as follows:");
        System.out.println("Player 1:"+sum1);
        System.out.println("Player 2:"+sum2);
        System.out.println("Round 2 starts! It's player 1's turn!");
        int player0=0;
        switch(player0){
            case 0:System.out.println("Player 1 rolls the dice...");
            break;
            case 1:System.out.println("Player 2 rolls the dice...");
            break;
        }
        p3=p.nextInt(6)+1;
        int sum3=sum1+p3;
        System.out.println("Player 1's score is:"+p3);
        System.out.println("It's player 2's turn!"); 
        int player1=1;
        switch(player1){
            case 0:System.out.println("Player 1 rolls the dice...");
            break;
            case 1:System.out.println("Player 2 rolls the dice...");
            break;
        }        
        p4=p.nextInt(6)+1;
        int sum4=sum2+p4;
        System.out.println("Player 2's score is:"+p4);
        System.out.println("Round over! The score is as follows:");
        System.out.println("Player 1:"+sum3);
        System.out.println("Player 2:"+sum4);
        if(sum3>sum4)
        System.out.println("Game over.Player 1 wins!");
        if(sum4>sum3)
        System.out.println("Game over.Player 2 wins!");
        if(sum3==sum4)
        System.out.println("Game over.It's a tie!");
    }
}
