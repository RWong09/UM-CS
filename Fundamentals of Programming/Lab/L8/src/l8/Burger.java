/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l8;

/**
 *
 * @author HP
 */
public class Burger {
    private String ID;
    private int sale;
    private static int tot;
    
    public Burger(String ID, int numofbursold){
        this.ID=ID;
        sales(numofbursold);
    }
    
    protected void sales(int numbers){
        sale+=numbers;
        tot+=numbers;
    }
    
    public static int getTotalsales(){
        return tot;
    }
    
    public int getSales(){
        return sale;
    }
    
    public String getID(){
        return ID;
    }
}
