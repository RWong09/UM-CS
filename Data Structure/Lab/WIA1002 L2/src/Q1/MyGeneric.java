/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;

/**
 *
 * @author HP
 */
public class MyGeneric<E> {
    private E e;

    public MyGeneric(){
    
    }

    public void setT(E e){
        this.e=e;
    }
    
    public E get(){
        return e;
    }
    
    public static void main(String[] args) {
        MyGeneric<String> strObj = new MyGeneric<>();
        MyGeneric<Integer> intObj=new MyGeneric<>();
        strObj.setT("This is a MyGeneric.");
        intObj.setT(50);
        System.out.println(strObj.get());
        System.out.println(intObj.get());
    }
    
}
