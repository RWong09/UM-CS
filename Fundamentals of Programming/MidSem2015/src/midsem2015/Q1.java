/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midsem2015;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1:To track the coordinate of an object
        Scanner co=new Scanner(System.in);
        int X,Y;
        String move;
        System.out.print("Enter the coordinate of X and Y:");
        X=co.nextInt();
        Y=co.nextInt();
        co.nextLine();
        System.out.print("Enter the move:");
        move=co.nextLine();
        System.out.println("Initial coordinate:("+X+","+Y+")");
       for(int i=0;i<move.length();i++){
           switch(move.charAt(i)){
           case'L': X--;
           break;
           case 'R': X++;
           break;
           case 'U': Y++;
           break;
           case 'D': Y--;
           break;
           }
       }   
        System.out.println("Final coordinate:("+X+","+Y+")");
    }
    
}
