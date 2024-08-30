/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author HP
 */
public class StorePairGeneric<T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>{
    private T first, second;
     
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public T getFirst() {
        return first;
    }
    
    public T getSecond() {
        return second;
    }
    
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    
    public String toString() {
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object o){
        StorePairGeneric<T> that = (StorePairGeneric<T>) o;
        return first.equals(that.first);
    }
    
    @Override
    public int compareTo(StorePairGeneric<T> that){
        return first.compareTo(that.first);
    }
    
    public static void main(String[] args) {
        StorePairGeneric<Integer> pair1 = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> pair2 = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> pair3 = new StorePairGeneric<>(6, 3);

        System.out.println(pair1.compareTo(pair2));
        System.out.println(pair1.compareTo(pair3));
        System.out.println(pair2.compareTo(pair1));
        System.out.println(pair2.compareTo(pair3));
        System.out.println(pair3.compareTo(pair1));
        System.out.println(pair3.compareTo(pair2));

        System.out.println(pair1.equals(pair2));
        System.out.println(pair1.equals(pair3));
        System.out.println(pair2.equals(pair3));
    }
}
