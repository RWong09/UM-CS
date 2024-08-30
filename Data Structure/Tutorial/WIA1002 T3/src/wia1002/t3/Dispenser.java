/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wia1002.t3;

/**
 *
 * @author HP
 */
public class Dispenser {
    private String item;
    private double cost;
    
    public Dispenser(String item,double cost){
        this.item=item;
        this.cost=cost;
    }
    
    public String getItem(){
        return item;
    }
    
    public double getCost(){
        return cost;
    }
    
    public void releaseItem(){
        System.out.println(item+" has been released.");
    }
}
