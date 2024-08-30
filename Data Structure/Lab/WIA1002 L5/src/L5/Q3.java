/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L5;

import java.util.NoSuchElementException;

/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> mylist=new DoublyLinkedList<>();
        mylist.addFirst(1);
        mylist.addLast(10);
        mylist.addLast(100);
        mylist.add(2, 2);
        
        mylist.remove(3);
        System.out.println();
        
        mylist.iterateForward();
        mylist.iterateBackward();
        System.out.println("size of current Doubly Linked List: "+mylist.getSize());
        mylist.clear();
        System.out.println();
        System.out.println("size of current Doubly Linked List: "+mylist.getSize());
    }
}

class DoublyLinkedList<E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public static class Node<E>{
        private E item;
        private Node<E> next;
        private Node<E> prev;
        
        public Node(){
        }
        
        public Node(E item){
            this.item=item;
        }
    }
    
    public int getSize(){
        return size;
    }
    
    public void addFirst(E e){
        Node<E> node=new Node<>(e);
        node.next=head;
        if(head!=null)
            head.prev=node;
        head=node;
        if(tail==null)
            tail=head;
        size++;
        System.out.println("adding: "+e);
    }
    
    public void addLast(E e){
        Node<E> node=new Node<>(e);
        node.prev=tail;
        if(tail!=null)
            tail.next=node;
        tail=node;
        if(head==null)
            head=tail;
        size++;
        System.out.println("adding: "+e);
    }
    
    public void add(int index,E e){
        if(index<0 || index>size)
            throw new IndexOutOfBoundsException();
        if(index==0)
            addFirst(e);
        else if(index==size)
            addLast(e);
        else{
            Node<E> current=head;
            for(int i=0;i<index-1;i++)
                current=current.next;
            Node<E> node=new Node<>(e);
            node.next=current.next;
            node.prev=current;
            current.next.prev=node;
            current.next=node;
            size++;
        }
    }
    
    public E removeFirst(){
        if(head==null)
            throw new NoSuchElementException();
        E remove=head.item;
        head=head.next;
        if(head!=null)
            head.prev=null;
        else
            tail=null;
        size--;
        System.out.println("deleted: "+remove);
        return remove;
    }
    
    public E removeLast(){
        if(tail==null)
            throw new NoSuchElementException();
        E remove=tail.item;
        tail=tail.prev;
        if(tail!=null)
            tail.next=null;
        else
            head=null;
        size--;
        System.out.println("deleted: "+remove);
        return remove;
    }
    
    public E remove(int index){
        if(index<0 || index>=size)
            throw new IndexOutOfBoundsException();
        if(index==0){
            return removeFirst();
        }
        if(index==size-1){
            return removeLast();
        }
        Node<E> get=head;
        for(int i=0;i<index-1;i++)
            get=get.next;
        E remove=get.item;
        get.prev.next=get.next;
        get.next.prev=get.prev;
        size--;
        System.out.println("deleted: "+remove);
        return remove;
    }
    
    public void iterateForward(){
        System.out.println("iterating forward..");
        Node<E> iteration=head;
        for(int i=0;i<size;i++){
            System.out.print(iteration.item+" ");
            iteration=iteration.next;
        }
        System.out.println();
    }
    
    public void iterateBackward(){
        System.out.println("iterating backward..");
        Node<E> iteration=head;
        String s="";
        for(int i=0;i<size;i++){
            s=iteration.item+" "+s;
            iteration=iteration.next;
        }
        System.out.println(s);
    }
    
    public void clear(){
        head=tail=null;
        System.out.printf("successfully clear %d node(s)\n",size);
        size=0;
    }
}