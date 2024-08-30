/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002.t3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CandyMachine {
    private Dispenser candies=new Dispenser("Candies",3.00);
    private Dispenser chips=new Dispenser("Chips",4.50);
    private Dispenser gum=new Dispenser("Gum",1.60);
    private Dispenser cookies=new Dispenser("Cookies",2.30);
    private CashRegister Counter=new CashRegister();
    
    public void display(){
        System.out.println("Welcome! The products for today:");
        System.out.println("(1) "+candies.getItem());
        System.out.println("(2) "+chips.getItem());
        System.out.println("(3) "+gum.getItem());
        System.out.println("(4) "+cookies.getItem());
    }
    
    public Dispenser select(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please select your item: ");
        int choice=sc.nextInt();
        return switch(choice){
            case 1 ->candies;
            case 2 ->chips;
            case 3 ->gum;
            case 4 ->cookies;
            default -> throw new IllegalStateException("Invalid selection!");
        };
    }
    
    public void showCost(Dispenser choice){
        System.out.printf("Cost of the item selected: %.2f\n",choice.getCost());
    }
    
    public void Start(){
        Scanner sc=new Scanner(System.in);
        while(true){
            display();
            
            Dispenser which=select();
            showCost(which);
            
            System.out.print("\nInsert money: ");
            double amount=sc.nextDouble();
            Counter.acceptMoney(amount);
            Counter.change(amount-which.getCost());
            
            which.releaseItem();
            System.out.println();
        }
    }
}
