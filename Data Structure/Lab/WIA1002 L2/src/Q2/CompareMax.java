/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author HP
 */
public class CompareMax {
    public static<E extends Comparable<E>>E maximum(E e1,E e2,E e3){
        if(e1.compareTo(e2)>0 && e1.compareTo(e3)>0)
            return e1;
        else if(e2.compareTo(e3)>0 && e2.compareTo(e1)>0)
            return e2;
        else
            return e3;
    }
    
    public static void main(String[] args) {
        System.out.println(CompareMax.maximum(150, 500, 325));
        System.out.println(CompareMax.maximum("James Bond", "Justin Lai", "John Cena"));
        System.out.println(CompareMax.maximum(false, false, true));
    }
}
