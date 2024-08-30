/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Checkout;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author HP
 */
public class Checkout {
    public static void main(String[] args) {
        CheckoutCounterStack<Integer> counters=new CheckoutCounterStack<>(5);
        CustomerCheckoutQueue<String> customers=new CustomerCheckoutQueue<>(5);
        
        //Check if the stack and queue is empty
        System.out.println("Is the counter stack empty? "+counters.isStackEmpty());
        System.out.println("Is the customer queue empty? "+customers.isQueueEmpty());
        
        Integer[] Tesco={12,14,6,9,5,3};
        for(int t:Tesco){
            counters.openCheckoutCounter(t);
            System.out.println("Counter "+t+" is opened.");
        }
        
        //Check if the stack is full
        System.out.println("Is the counter stack full? "+counters.isStackFull());
        
        String[] TescoCust={"John","JC","Soon","Zhen Yu","Han Lin","Wong"};
        for(String cust:TescoCust){
            customers.joinCheckoutLine(cust);
            System.out.println(cust+" is added to the queue.");
        }
        
        //Check if the queue is full
        System.out.println("Is the queue full? "+customers.isQueueFull());
        
        while(!counters.isStackEmpty() && !customers.isQueueEmpty()){
            System.out.println("Next customer: "+customers.viewNextCustomer());
            System.out.println("To counter "+counters.closeCheckoutCounter());
            System.out.println("Customer "+customers.processCheckout()+" completed.");
        }
    }
}

class CheckoutCounterStack<E>{
    private ArrayList<E> list=new ArrayList<>();
    private int capacity;
    
    public CheckoutCounterStack(int capacity){
        this.capacity=capacity;
    }
    
    public CheckoutCounterStack(){
        this(20);
    }
    
    public void openCheckoutCounter(E counterNumber){
        if(isStackFull())
            System.out.println("The counters are full!");
        else
            list.add(counterNumber);
    }
    
    public E closeCheckoutCounter(){
        if(isStackEmpty()){
            System.out.println("There is no counter to be closed.");
            return null;
        }
        else
            return list.remove(list.size()-1);
    }
    
    public E viewTopCheckoutCounter(){
        if(isStackEmpty()){
            System.out.println("There is no counter to be found.");
            return null;
        }
        else
            return list.get(list.size()-1);
    }
    
    public boolean isStackEmpty(){
        return list.isEmpty();
    }
    
    public boolean isStackFull(){
        return list.size()==capacity;
    }
}

class CustomerCheckoutQueue<E>{
    private LinkedList<E> queue=new LinkedList<>();
    private int capacity;
    
    public CustomerCheckoutQueue(int capacity){
        this.capacity=capacity;
    }
    
    public CustomerCheckoutQueue(){
        this(10);
    }
    
    public void joinCheckoutLine(E customerName){
        if(isQueueFull())
            System.out.println("The checkout lines are full! Please wait.");
        else
            queue.add(customerName);
    }
    
    public E processCheckout(){
        if(isQueueEmpty()){
            System.out.println("There is no customer in the queue.");
            return null;
        }
        else
            return queue.remove(0);
    }
    
    public E viewNextCustomer(){
        if(isQueueEmpty()){
            System.out.println("There is no customer in the queue to be viewed.");
            return null;
        }
        else
            return queue.get(0);
    }
    
    public boolean isQueueEmpty(){
        return queue.isEmpty();
    }
    
    public boolean isQueueFull(){
        return queue.size()==capacity;
    }
}