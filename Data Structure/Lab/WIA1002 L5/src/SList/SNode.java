/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SList;

/**
 *
 * @author HP
 */
public class SNode<E>{
    SNode<E> next;
    E item;
    
    public SNode(){ 
    }
    
    public SNode(E item){
        this.item=item;
    }
}
