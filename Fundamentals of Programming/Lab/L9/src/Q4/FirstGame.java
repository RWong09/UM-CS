/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;
import java.util.Random;
/**
 *
 * @author HP
 */
public class FirstGame extends DiceGameSetup{
    Random r=new Random();
    
    @Override
    public int rollDice(String playername,int totalscore){
        System.out.println("It's "+playername+" turn!");
        int dice1=r.nextInt(6)+1;
        int dice2=r.nextInt(6)+1;
        System.out.println(playername+" scores "+dice1+" and "+dice2+" respectively.");
        totalscore+=(dice1+dice2);
        if(dice1==dice2){
            do{
                System.out.println("Both dices have the same score! Roll again!");
                dice1=r.nextInt(6)+1;
                dice2=r.nextInt(6)+1;
                totalscore+=(dice1+dice2);
                System.out.println(playername+" scores "+dice1+" and "+dice2+" respectively.");
                if(totalscore>=100)
                    break;
            }while(dice1==dice2);
        }
        System.out.println("Turn ended."+playername +" has the score of: "+totalscore);
        return totalscore;
    }
}
