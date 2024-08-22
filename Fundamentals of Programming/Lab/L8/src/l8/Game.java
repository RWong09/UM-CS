/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l8;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Game {
    int x=0,y=0,t1=0,t2=0;
    
    public Game(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your name, player 1: ");
        String p1=sc.nextLine();
        System.out.print("Please enter your name, player 2: ");
        String p2=sc.nextLine();
        System.out.println("Let's start the game!");
        while(t1<100 && t2<100){
            move(p1,p2);
            t1+=x;
            t2+=y;
            setvalues(t1,t2);
            System.out.println("Player 1: "+t1);
            System.out.println("Player 2: "+t2);
            if(t1==t2 && t1>100 && t2>100){
                do{
                System.out.println("It's a tie! Extra round to decide!");
                move(p1,p2);
                System.out.println("Player 1: "+x);
                System.out.println("Player 2: "+y);
                setvalues(x,y);
                    if(x>y){
                        break;
                    }
                    else if(y>x){
                        break;
                    }
                    else{
                    System.out.println("It's a tie!");
                    }
                }while(x==y);
            }
        }
    }
    
    public void move(String a, String b){
        Random r=new Random();
        System.out.println("It's player 1 to move!");
        x=r.nextInt(6)+1;
        System.out.println("The score is: "+x);
        System.out.println("It's player 2 turn!");
        y=r.nextInt(6)+1;
        System.out.println("The score is: "+y);
        System.out.println("The round has ended, the score is as follows:");
    }
    
    protected void setvalues(int t1, int t2){
        this.t1=t1;
        this.t2=t2;
    }
    
    protected int getvaluet1(){
        return t1;
    }
    
    protected int getvaluet2(){
        return t2;
    }
}
