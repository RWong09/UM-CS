/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package T5;

/**
 *
 * @author HP
 */
public class Q1 {
    public static void main(String[] args) {
        /*
         *  a)
         * Line 10 - 13:
         * If index is 0, replace the head's element with e and return this new element.
         * However, it is expected that the head's initial element is returned.
         * Line 14 - 21:
         * Otherwise, replace the (index) node's element with e and return this new element.
         * To do so, current is set to be the node before the (index) node.
         * Then, the node after current is accessed to replace its element with e.
         * However, it is expected that the (index) initial element is returned.
         *
         * b) 
         * Replace the (index) node's element with e and return its initial element.
         * However, if the index is beyond the bounds, a node with element e will be added to the respective end and null will be returned.
         */
    }
}

class LinkedList<E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    private static class Node<E>{
        E item;
        Node<E> next;
        
        public Node(E item){
            this.item=item;
        }
    }
    
    public void addFirst(E e){
        Node<E> first=new Node<>(e);
        first.next=head;
        head=first;
        size++;
        if(tail==null){
            tail=head;
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
    
    public E xyz(int index,E e){
        Node<E> current=head;
        Node<E> temp;
        if(index==0){ 
            addFirst(e);
            return null;
        }
        else if(index>=size-1){
            addLast(e);
            return null;
        }
        else{
            for (int i = 0; i < index; i++){
                current=current.next;
            }
            E item=current.item;
            current.item=e;
            return item;
        }
    }
}