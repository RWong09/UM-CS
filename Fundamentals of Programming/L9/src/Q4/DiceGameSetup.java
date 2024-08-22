/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author HP
 */
public class DiceGameSetup {
    public void Setup(){
        int Player1=0;
        int Player2=0;
        
        while(true){
            Player1=rollDice("Player 1",Player1);
            if(Player1>=100)
                break;
            Player2=rollDice("Player 2",Player2);
            if(Player2>=100)
                break;
            System.out.println();
        }
        System.out.println("Round has ended. "+(Player1>=100 ?"Player 1" : "Player 2")+ " is the winner!");
    }
    
    protected int rollDice(String playername,int totalScore){
        return 0;
    }
}
