/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l8;

/**
 *
 * @author HP
 */
public class TesterQ5 {
    public static void main(String[] args) {
        Game G1=new Game();
        int a=G1.getvaluet1();
        int b=G1.getvaluet2();
        if(a>b){
            System.out.println("Player 1 wins!");
        }
        else if(b>a){
            System.out.println("Player 2 wins!");
        }
        else{
            System.out.println("It's a tie!");
        }
    }
}
