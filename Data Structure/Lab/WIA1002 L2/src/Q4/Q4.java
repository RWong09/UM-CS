/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

public class Q4 {
    public static <E extends Comparable<E>> String minmax(E[] array){
        E min=array[0];
        E max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i].compareTo(min)<0)
                min=array[i];
            if(array[i].compareTo(max)>0)
                max=array[i];
        }
        return String.format("Min: %s\nMax: %s", min,max);
    }
    
    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        Person[] compare={new Person("Ali"),new Person("Abu"),new Person("Ahmad")};
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
        System.out.println(minmax(compare));
    }
}

class Person implements Comparable<Person>{
    private String name;
    
    public Person(String name){
        this.name=name;
    }
    
    public String toString(){
        return name;
    }
    
    @Override
    public int compareTo(Person that) {
        return this.name.compareTo(that.name);
    }
}
