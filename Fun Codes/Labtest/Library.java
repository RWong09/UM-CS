/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Labtest;
import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author HP
 */
public class Library {
    public static void main(String[] args) {
        //ID uses integer, string is just for fun lol
        BorrowedBooksStack<String> stack1=new BorrowedBooksStack<>(5);
        ReturnedBooksQueue<String> queue1=new ReturnedBooksQueue<>();
        
        String[] borrowedbooks={"Harry Potter","Sherlock Holmes","Stephen Chow","Max Verstappen","Adrian Newey"};
        for(String books:borrowedbooks){
            stack1.borrowbook(books);
        }
        System.out.println("Is the borrowed book stack full? "+stack1.isFull());
        
        System.out.println("Top book ID: "+stack1.peekAtTopBook());
        
        System.out.println("Stimulating a returned book...");
        String getReturnedbook=stack1.returnBook();
        
        queue1.returnedBook(getReturnedbook);
        System.out.println(queue1.peekAtFrontBook()+" returned successfully.");
    }
}

class BorrowedBooksStack<E>{
    private ArrayList<E> list=new ArrayList<>();
    private int capacity;
    
    public BorrowedBooksStack(int capacity){
        this.capacity=capacity;
    }
    
    public BorrowedBooksStack(){
        this(20);
    }
    
    public void borrowbook(E bookID){
        if(isFull())
            System.out.println("The book stack is full!");
        else
            list.add(bookID);
    }
    
    public E returnBook(){
        if(isEmpty()){
            System.out.println("The book stack is empty!");
            return null;
        }
        else
            return list.remove(list.size()-1);
    }
    
    public E peekAtTopBook(){
        if(isEmpty()){
            System.out.println("The book stack is empty!");
            return null;
        }
        else
            return list.get(list.size()-1);
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public boolean isFull(){
        return list.size()==capacity;
    }
}

class ReturnedBooksQueue<E>{
    private LinkedList<E> queue=new LinkedList<>();
    private int capacity;
    
    public ReturnedBooksQueue(){
        this(20);
    }
    
    public ReturnedBooksQueue(int capacity){
        this.capacity=capacity;
    }
    
    public void returnedBook(E bookID){
        if(isFull())
            System.out.println("The queue is full!");
        else
            queue.add(bookID);
    }
    
    public E processReturnedBooks(){
        if(isEmpty()){
            System.out.println("The queue is empty!");
            return null;
        }
        else
            return queue.pop();
    }
    
    public E peekAtFrontBook(){
        if(isEmpty()){
            System.out.println("The queue is empty!");
            return null;
        }
        else
            return queue.peek();
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public boolean isFull(){
        return queue.size()==capacity;
    }
}