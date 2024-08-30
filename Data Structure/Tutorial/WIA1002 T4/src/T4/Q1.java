/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T4;

/**
 *
 * @author HP
 */
public class Q1 {
    public static void main(String[] args) {
        LinkedList.main(args);
    }
}

class LinkedList<E>{
    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=2;
    
    private static class Node<E>{
        E item;
        Node<E> next;
        
        public Node(E item){
            this.item=item;
        }
    }
    
    public static void main(String[] args) {
        //a)
        LinkedList<Character> list=new LinkedList<>();
        Node<Character> node1=new Node<>('a');
        Node<Character> node2=new Node<>('z');
        list.head=node1;
        list.tail=node2;
        
        //c)
        node1.next=node2;
        list.printList();
        
        System.out.println();
        //g)
        list.addFirst('b');
        list.printList();
        
        System.out.println();
        //h)(i)
        list.addLast('c');
        list.printList();
        
        System.out.println();
        //h)(ii)
        list.add(2, 'd');
        list.printList();
        
        System.out.println();
        //h)(iii)
        list.removeFirst();
        list.printList();
        
        System.out.println();
        //h)(iv)
        list.removeLast();
        list.printList();
        
        System.out.println();
        //h)(v)
        list.remove(1);
        list.printList();

    }
    
    public void addFirst(E e){
        /**e)
         * Condition to consider:
         * Whether the list contains any node.
         * If it doesn't, the tail should be set to this new node.
         * 
         * f)
         * Set the next of this firstNode to the current head.
         * Set the head to this firstNode.
         * Increase the count for the size of the list.
         */
        
        //g)
        Node<E> first=new Node<>(e);
        first.next=head;
        head=first;
        size++;
        if(tail==null){
            tail=head;
        }
    }
    
    public void addLast(E e){
        /**e)
         * Condition to consider:
         * Whether the list contains any node.
         * If it doesn't, both the head and tail should be set to this new node.
         * 
         * f)
         * Set the next of the current node to this new node.
         * Set the tail to this new node.
         * Increase the count for the size of the list.
         */
        
        //h)(i)
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
        /**e)
         * Condition to consider:
         * Whether the index is less than 0.
         * If so, we can throw an exception.
         * 
         * f)
         * If the index is 0, invoke the addFirst method.
         * If the index is equal to the size of the list, invoke the addLast method.
         * Otherwise, search for (index-1)node and assign it to current.
         * Set the next of this new node to the node after the current.
         * Set the next of the current to this new node.
         * Increase the count for the size of the list.
         */
        
        //h)(ii)
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
        /**e)
         * Condition to consider:
         * -Whether the list contains any node.
         * If it doesn't, null is returned.
         * -Whether the list contains only one node.
         * If so, set both the head and tail to null and return the item of that node.
         * 
         * f)
         * Set the head to the node after the current head.
         * Reduce the count of the size of the list.
         * Return the item of the initial head.
         */
        
        //h)(iii)
        if(size==0)
            return null;
        E taken=head.item;
        head=head.next;
        size--;
        if(head==null)
            tail=null;
        return taken;
    }
    
    public E removeLast(){
        /**e)
         * Condition to consider:
         * -Whether the list contains any node.
         * If it doesn't, null is returned.
         * -Whether the list contains only one node.
         * If so, set both the head and tail to null and return the item of that node.
         * 
         * f)
         * Assign the node before the tail to current.
         * Set the next of the current to null.
         * Reduce the count of the size of the list.
         * Return the item of the initial tail.
         */
        
        //h)(iv)
        if(size==0)
            return null;
        else if(size==1){
            E taken=head.item;
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
            return get.item;
        }
    }
    
    public E remove(int index){
        /**e)
         * Condition to consider:
         * -Whether the index is less than 0 or greater than or equal to the size of the list.
         * If so, we can either throw an exception or return null.
         * 
         * f)
         * If the index is 0, invoke the removeFirst method.
         * If the index is equal to (size-1), invoke the removeLast method.
         * Otherwise, search for (index-1)node and assign it as now.
         * Take the next of the now as the item to be removed and set it as temp.
         * Set the next of the now as the next of the temp as the temp will be removed.
         * Reduce the count of the size of the list.
         * Return the item of the node that is removed.
         */
        
        //h)(v)
        if(index<0 || index>=size)
            return null;
        else if(index==0)
            removeFirst();
        else if(index==size-1)
            removeLast();
        else{
            Node<E> now=head;
            for(int i=0;i<index-1;i++)
                now=now.next;
            Node<E> temp=now.next;
            now.next=temp.next;
            size--;
            return temp.item;
        }
        return null;
    }
    
    public void printList(){
        Node<E> current=head;
        System.out.println("The elements of the list are as follows:");
        while(current!=null){
            System.out.print(current.item);
            current=current.next;
        }
        System.out.println();
    }
}