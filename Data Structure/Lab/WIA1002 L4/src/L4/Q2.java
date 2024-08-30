/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L4;

/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        //For odd number of list
        LinkedList<Integer> list1=new LinkedList<>();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);
        list1.addLast(69);
        list1.addLast(100);
        System.out.println("The middle value of the list is: "+list1.getMiddleValue());
        
        //For even number of list
        list1.addLast(200);
        System.out.println("The middle value of the list is: "+list1.getMiddleValue());
    }
}

class LinkedList<E>{
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size;
    
    private static class Node<E>{
        E item;
        Node<E> next;
        
        public Node(E item){
            this.item=item;
        }
    }
    
    public void addLast(E e){
        if(tail==null){
            head=tail=new Node<>(e);
        }
        else{
            tail.next=new Node<>(e);
            tail=tail.next;
        }
        size++;
    }
    
    public E getMiddleValue(){
        Node<E> current=head;
        if(size%2==0){
            for(int i=1;i<size/2;i++){
                current=current.next;
            }
            return current.item;
        }
        else{
            for(int i=0;i<size/2;i++)
                current=current.next;
            return current.item;
        }
    }
}