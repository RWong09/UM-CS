/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;

/**
 *
 * @author HP
 */
public class Container<T> {
    private T t;
    
    public Container(){
        
    }
    
    public void add(T t){
        this.t=t;
    }
    
    public T retrieve(){
        return t;
    }
    
    public static void main(String[] args) {
      Container<Integer> intContainer=new Container();
      Container<String> StrContainer=new Container();
      intContainer.add(50);
      StrContainer.add("Java");
      System.out.println(intContainer.retrieve());
      System.out.println(StrContainer.retrieve());
    }    
}
