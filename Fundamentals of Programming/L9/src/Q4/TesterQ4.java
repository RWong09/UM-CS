/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author HP
 */
public class TesterQ4 {
    public static void main(String[] args) {
        FirstGame Dice=new FirstGame();
        System.out.println("First round!");
        Dice.Setup();
        System.out.println();
        
        SecondGame Noname=new SecondGame();
        System.out.println("Second round, begin!");
        Noname.Setup();
    }
}
