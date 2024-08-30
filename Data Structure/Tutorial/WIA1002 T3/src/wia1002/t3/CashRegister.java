/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wia1002.t3;

/**
 *
 * @author HP
 */
public class CashRegister {
    private double amount=100;
    
    public void acceptMoney(double amount){
        this.amount+=amount;
    }
    
    public void change(double amount){
        if(amount<0){
            throw new IllegalArgumentException("Insufficient amount of cash!!!");
        }
        if(amount>this.amount){
            throw new IllegalArgumentException("Not enough cash to change.");
        }
        this.amount-=amount;
        System.out.printf("A change of RM%.2f has been returned.\n",amount);
    }
}
