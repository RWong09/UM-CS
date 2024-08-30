/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L7;

import java.util.Collections;
import java.util.LinkedList;

public class Q1 {
    public static void main(String[] args) {
        String[] fruitQ={"Durian","Blueberry"};
        MyQueue<String> fruits=new MyQueue<>(fruitQ);
        fruits.enqueue("Apple");
        fruits.enqueue("Orange");
        fruits.enqueue("Grapes");
        fruits.enqueue("Cherry");
        System.out.println(fruits);
        System.out.println(fruits.peek());
        System.out.println("Size of the queue: "+fruits.getSize());
        System.out.println(fruits.dequeue()+" deleted successfully.");
        System.out.println(fruits.getElement(2)+" is in index position of 2.");
        System.out.println("Cherry is in the queue: "+fruits.contains("Cherry"));
        System.out.println("Durian is in the queue: "+fruits.contains("Durian"));
        while(!fruits.isEmpty())
            System.out.print(fruits.dequeue()+" ");
        System.out.println();
    }
}

class MyQueue<E>{
    private LinkedList<E> list;
    
    public MyQueue(E[] e){
        this();
        Collections.addAll(list, e);
    }
    
    public MyQueue(){
        list=new LinkedList<>();
    }
    
    public void enqueue(E e){
        list.add(e);
    }
    
    public E dequeue(){
        return list.removeFirst();
    }
    
    public E getElement(int i){
        return list.get(i);
    }
    
    public E peek(){
        return list.getFirst();
    }
    
    public int getSize(){
        return list.size();
    }
    
    public boolean contains(E e){
        return list.contains(e);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}