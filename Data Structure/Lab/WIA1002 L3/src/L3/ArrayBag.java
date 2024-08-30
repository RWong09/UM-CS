/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L3;

/**
 *
 * @author HP
 */
public class ArrayBag<T> implements BagInterface<T>{
    private T[] bag;
    private static final int DEFAULT_CAPACITY=25;
    private int numberOfEntries;
    
    public ArrayBag(){
        this(DEFAULT_CAPACITY);
    }
    
    @SuppressWarnings("unchecked")
    public ArrayBag(int capacity) {
        bag = (T[]) new Object[capacity];
    }
    
    @Override
    public int getCurrentSize(){
        return numberOfEntries;
    }
    
    @Override
    public boolean isFull(){
        return numberOfEntries==bag.length;
    }
    
    @Override
    public boolean isEmpty(){
        return numberOfEntries==0;
    }
    
    @Override
    public boolean add(T newEntry){
        if(isFull())
            return false;
        bag[numberOfEntries]=newEntry;
        numberOfEntries++;
        return true;
    }
    
    @Override
    public T remove(){
        if(isEmpty())
            return null;
        T item=bag[--numberOfEntries];
        bag[numberOfEntries]=null;
        return item;
    }
    
    @Override
    public boolean remove(T anEntry){
        int index=-1;
        for(int i=0;i<numberOfEntries;i++){
            if(bag[i].equals(anEntry)){
                index=i;
                break;
            }
        }
        if(index==-1)
            return false;
        
        bag[index]=bag[--numberOfEntries];
        bag[numberOfEntries]=null;
        return true;
    }
    
    @Override
    public void clear(){
        bag = (T[]) new Object[bag.length];
    }
    
    @Override
    public int getFrequencyOf(T anEntry){
        int freq = 0;
        for (int i = 0; i < numberOfEntries; i++){
            if (bag[i].equals(anEntry))
                freq++;
        }
        return freq;
    }
    
    @Override
    public boolean contains(T anEntry){
        for (int i = 0; i < numberOfEntries; i++){
            if (bag[i].equals(anEntry))
                return true;
        }
        return false;
    }
    
    @Override
    public T[] toArray(){
        T[] arr=(T[])new Object[numberOfEntries];
        System.arraycopy(bag, 0, arr, 0, numberOfEntries);
        return arr;
    }
    
    @Override
    public BagInterface<T> union(BagInterface<? extends T> bag2){
        BagInterface<T> Union=new ArrayBag<>(getCurrentSize()+bag2.getCurrentSize());
        for(int i=0;i<numberOfEntries;i++)
            Union.add(bag[i]);
        T[] bag2Array=bag2.toArray();
        for(T item:bag2Array){
            Union.add(item);
        }
        return Union;
    }
    
    @Override
    public BagInterface<T> intersection(BagInterface<? extends T> bag2) {
        BagInterface<T> Intersection = new ArrayBag<>(numberOfEntries);
        T[] bag2Array = bag2.toArray();
        for (int i = 0; i < numberOfEntries; i++) {
            T item = bag[i];
            for (int j = 0; j < bag2Array.length; j++) {
                if (item.equals(bag2Array[j])) {
                    Intersection.add(item);
                    bag2Array[j] = null;
                    break;
                }
            }
        }
        return Intersection;
    }

    @Override
    public BagInterface<T> difference(BagInterface<? extends T> bag2) {
        BagInterface<T> difference = new ArrayBag<>(numberOfEntries);
        for (int i = 0; i < numberOfEntries; i++)
            difference.add(bag[i]);
        T[] bag2Array = bag2.toArray();
        for (T objects : bag2Array)
            difference.remove(objects);
        return difference;
    }
}
