/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L8;
import java.util.PriorityQueue;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        PriorityQueue<String> list1=new PriorityQueue<>();
        PriorityQueue<String> list2=new PriorityQueue<>();
        list1.add("George");
        list1.add("Jim");
        list1.add("John");
        list1.add("Blake");
        list1.add("Kevin");
        list1.add("Michael");
        list2.add("George");
        list2.add("Katie");
        list2.add("Kevin");
        list2.add("Michelle");
        list2.add("Ryan");
        
        //Find union
        PriorityQueue<String> temp=new PriorityQueue<>();
        PriorityQueue<String> union=new PriorityQueue<>();
        union.addAll(list1);
        temp.addAll(list2);
        while(!temp.isEmpty()){
            String get=temp.poll();
            if(!union.contains(get))
                union.add(get);
        }
        System.out.println("Union set: "+union.toString());
        
        //Find difference
        PriorityQueue<String> difference=new PriorityQueue<>();
        difference.addAll(list1);
        temp.addAll(list2);
        while(!temp.isEmpty()){
            String get=temp.poll();
            if(difference.contains(get))
                difference.remove(get);
        }
        System.out.println("Difference set for A: "+difference.toString());
        difference.clear();
        difference.addAll(list2);
        temp.addAll(list1);
        while(!temp.isEmpty()){
            String get=temp.poll();
            if(difference.contains(get))
                difference.remove(get);
        }
        System.out.println("Difference set for B: "+difference.toString());
        
        //Find intersection
        PriorityQueue<String> intersection=new PriorityQueue<>();
        temp.addAll(list2);
        while(!temp.isEmpty()){
            String get=temp.poll();
            if(list1.contains(get))
                intersection.add(get);
        }
        System.out.println("Intersection set: "+intersection);
    }
}
