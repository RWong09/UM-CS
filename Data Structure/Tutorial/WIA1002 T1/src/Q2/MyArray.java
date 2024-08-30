/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author HP
 */
public class MyArray {
    public static void main(String[] args) {
        Integer[] myNum={1,2,3,4,5};
        String[] names={"Jane","Tom","Bob"};
        Character[] alphabet={'a','b','c'};
        
        listAll(myNum);
        listAll(names);
        listAll(alphabet);
    }
    
    public static <T> void listAll(T[] t) {
        for(T a:t){
            System.out.print(a+ " ");
        }
        System.out.println();
    }
}
