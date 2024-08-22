/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l8;

/**
 *
 * @author HP
 */
public class Money {
    private double total;
    private int _100note,_50note,_10note,_5note,_1note;
    private int _50cents,_20cents,_10cents,_5cents;
    
    public Money(double total){
        assignvalue(total);
    }
    
    public void assignvalue(double total){
        this.total=round(total);
        int notes=(int)(this.total);
        int cents=(int)(this.total*100%100);
        
        _100note = notes / 100;
        notes %= 100;
        _50note = notes / 50;
        notes %= 50;
        _10note = notes / 10;
        notes %= 10;
        _5note = notes / 5;
        notes %= 5;
        _1note = notes;

        _50cents = cents / 50;
        cents %= 50;
        _20cents = cents / 20;
        cents %= 20;
        _10cents = cents / 10;
        cents %= 10;
        _5cents = cents / 5;
    }
    
    public void add(Money money){
        assignvalue(total+money.total);
    }
    
    public void minus(Money money){
        if(total-money.total<0){
            System.out.println("Insufficient balance.Please try again.");
            throw new IllegalStateException("The amount of the first money is less than the next money!");
        }
        assignvalue(total-money.total);
    }
    
    public double round(double total){
        int amount=(int)(total*100);
        int secdigit=amount%10;
        amount/=10;
        int firstdigit=amount%10;
        amount/=10;
        
        return switch(secdigit){
            case 0,1,2->amount+firstdigit/10.0;
            case 8,9->amount+(firstdigit+1)/10.0;
            default->amount+(10*firstdigit+5)/100.0;
        };
    }
    
    @Override
    public String toString() {
        return "Amount = " + String.format("%.2f", total) + "\n" +
            "RM100 = " + _100note + "\n" +
            "RM50 = " + _50note + "\n" +
            "RM10 = " + _10note + "\n" +
            "RM5 = " + _5note + "\n" +
            "RM1 = " + _1note + "\n" +
            "50Cent = " + _50cents + "\n" +
            "20Cent = " + _20cents + "\n" +
            "10Cent = " + _10cents + "\n" +
            "5Cent = " + _5cents;
    }
}
