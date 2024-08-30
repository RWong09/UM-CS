/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T5;

/**
 *
 * @author HP
 */
public class Q3 {
    public static class Node<E>{
        E element;
        Node<E> next;
        Node<E> prev;
        Node<E> head;
        
        public Node(E element){
            this.element=element;
        }
        
        public Node(E element,Node<E> prev,Node<E> next){
            this.element=element;
            this.next=next;
            this.prev=prev;
        }    
    }
    
    public static void main(String[] args) {
        Node<Character> head=new Node('a');
        Node<Character> middle=new Node('b',head,null);
        Node<Character> tail=new Node('c',middle,null);
        head.next=middle;
        middle.next=tail;
        
        Node<Character> newNode=new Node('d',tail,null);
        tail.next=newNode;
        tail=newNode;
    }
}
