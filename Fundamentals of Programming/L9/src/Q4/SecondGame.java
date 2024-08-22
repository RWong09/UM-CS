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
public class SecondGame extends DiceGameSetup{
    Random r=new Random();
    
    @Override
    public int rollDice(String playername, int totalscore){
        int dice1=r.nextInt(6)+1;
        if(dice1 !=6){
            System.out.println(playername+" scores "+dice1+".");
            totalscore+=dice1;
        }
        else{
            System.out.println(playername+" rolls a 6! Roll again!");
            int dice2=r.nextInt(6)+1;
            if(dice2 !=6){
                if(totalscore<=100){
                    System.out.println(playername+" scores "+dice2+".");
                    totalscore+=(dice1+dice2);
                }
                else{
                    totalscore+=dice1;
                }
            }
            else{
                System.out.println("Uh oh, you rolled another 6! No scores given!");
            }
        }
        System.out.println("Turn ended."+playername+" has the score of: "+totalscore);
        return totalscore;
    }
}
