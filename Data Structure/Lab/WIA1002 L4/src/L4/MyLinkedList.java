/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L4;

/**
 *
 * @author HP
 */
public class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    private static class Node<E>{
        E element;
        Node<E> next;
        
        public Node(){
            
        }
        
        public Node(E element){
            this.element=element;
        }
    }
    
    public MyLinkedList(){
        
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
    
    public void add(int index,E e){
        if(index<0)
            throw new ArithmeticException("Index cannot be negative!");
        else if(index==0){
            addFirst(e);
        }
        else if(index>=size){
            addLast(e);
        }
        else{
            Node<E> now=head;
            
            for(int i=0;i<index-1;i++)
                now=now.next;
            Node<E> temp=now.next;
            now.next=new Node<>(e);
            (now.next).next=temp;
            size++;
        }
    }
    
    public E removeFirst(){
        if(size==0)
            return null;
        E taken=head.element;
        head=head.next;
        size--;
        if(head==null)
            tail=null;
        return taken;
    }
    
    public E removeLast(){
        if(size==0)
            return null;
        else if(size==1){
            E taken=head.element;
            head=tail=null;
            size=0;
            return taken;
        }
        else{
            Node<E> current=head;
            for(int i=0;i<size-2;i++)
                current=current.next;
            Node<E> get=tail;
            tail=current;
            tail.next=null;
            size--;
            return get.element;
        }
    }
    
    public E remove(int index){
        if(index<0 || index>=size)
            return null;
        else if(index==0){
            removeFirst();
            return null;
        }
        else if(index==size-1){
            removeLast();
            return null;
        }
        else{
            Node<E> now=head;
            for(int i=0;i<index-1;i++)
                now=now.next;
            Node<E> temp=now.next;
            now.next=temp.next;
            size--;
            return temp.element;
        }
    }
    
    public boolean contains(E e){
        Node<E> check=head;
        for(int i=0;i<size;i++){
            if(check.element.equals(e))
                return true;
            check=check.next;
        }
        return false;
    }
    
    public E get(int index){
        if(index<0 || index>=size)
            return null;
        Node<E> current=head;
        for(int i=0;i<index;i++)
            current=current.next;
        return current.element;
    }
    
    public E getFirst(){
        if(head==null)
            return null;
        return head.element;
    }
    
    public E getLast(){
        if(tail==null)
            return null;
        return tail.element;
    }
    
    public int indexOf(E e){
        Node<E> check=head;
        for(int i=0;i<size;i++){
            if(check.element.equals(e)){
                return i+1;
            }
            check=check.next;
        }
        return -1;
    }
    
    public int lastindexOf(E e){
        int index=-1;
        Node<E> check=head;
        for(int i=0;i<size;i++){
            if(check.element.equals(e)){
                index=i+1;
            }
            check=check.next;
        }
        return index;
    }
    
    public E set(int index, E e){
        if(index<0 || index>=size){
            return null;
        }
        Node<E> change=head;
        for(int i=0;i<index;i++){
            change=change.next;
        }
        E temp=change.element;
        change.element=e;
        return temp;
    }
    
    public void clear(){
        head=tail=null;
        size=0;
    }
    
    public void print(){
        Node<E> current=head;
        System.out.println("The elements of the list are as follows:");
        while(current!=null){
            System.out.print(current.element);
            current=current.next;
        }
        System.out.println();
    }   
    
    public void reverse(){
        Node<E> current=head;
        System.out.println("The elements of the list in reversed order is as follows:");
        String s="";
        while(current!=null){
            s=current.element+s;
            current=current.next;
        }
        System.out.println(s);
    }
}
