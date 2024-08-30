/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L6;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class TestMyStack {
    public static void main(String[] args) {
        MyStack<Character> list=new MyStack<>();
        list.push('a');
        list.push('b');
        list.push('c');
        System.out.println(list);
        System.out.println("'b' is in the stack: "+list.search('b'));
        System.out.println("'k' is in the stack: "+list.search('k'));
        System.out.println();
        
        MyStack<Integer> num=new MyStack<>();
        num.push(1);
        num.push(2);
        num.push(3);
        System.out.println(num);
        System.out.println("6 is in the stack of numbers: "+num.search(6));
    }
    
}

class MyStack<E>{
    private ArrayList<E> stack=new ArrayList<>();
    
    public void push(E o){
        stack.add(o);
    }
    
    public E pop(){
        return stack.remove(stack.size()-1);
    }
    
    public E peek(){
        return stack.get(stack.size()-1);
    }
    
    public int getSize(){
        return stack.size();
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    @Override
    public String toString(){
        return stack.toString();
    }
    
    public boolean search(E o){
        return stack.contains(o);
    }
}