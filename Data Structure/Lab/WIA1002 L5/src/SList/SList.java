/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

/**
 *
 * @author HP
 */
public class SList<E> {
    private SNode<E> head;
    private SNode<E> tail;
    private int size;
    
    public void appendEnd(E e){
        SNode<E> newNode=new SNode<>(e);
        if(tail!=null)
            tail.next=newNode;
        tail=newNode;
        if(head==null)
            head=tail;
        size++;
    }
    
    public E removeInitial(){
        if(head==null)
            return null;
        E temp=head.item;
        head=head.next;
        if(head==null)
            tail=null;
        size--;
        return temp;
    }
    
    public boolean contains(E e){
        SNode<E> check=head;
        for(int i=0;i<size;i++){
            if(check.equals(e))
                return true;
            check=check.next;
        }
        return false;
    }
    
    public void clear(){
        head=tail=null;
        size=0;
        System.out.println("The list is empty.");
    }
    
    public void display(){
        SNode<E> print=head;
        System.out.println("The elements inside the list are:");
        for(int i=0;i<size;i++){
            System.out.print(print.item+" ");
            print=print.next;
        }
        System.out.println();
    }
}
