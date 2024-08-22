/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l8;

/**
 *
 * @author HP
 */
public class TesterQ6 {
    public static void main(String[] args) {
        Burger S1=new Burger("23053016",1000);
        Burger S2=new Burger("11256047",679);
        Burger S3=new Burger("21037578",956);
        Burger S4=new Burger("M3209753",423);
        Burger S5=new Burger("G1957229",842);
        printStallsales(S1);
        printStallsales(S2);
        printStallsales(S3);
        printStallsales(S4);
        printStallsales(S5);
        System.out.println("The total sales for all stalls is: "+S5.getTotalsales());
    }
    
    private static void printStallsales(Burger stalls){
        System.out.println("Stall ID: "+stalls.getID());
        System.out.println("The stall sold "+stalls.getSales()+" burgers.");
    }
}
