/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L8;
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Collections;

public class Q1 {
    public static void main(String[] args) {
        Integer[] arrays={4,8,1,2,9,6,3,7};
        PriorityQueue<Integer> nums=new PriorityQueue<>(Arrays.asList(arrays));
        
        System.out.println("Elements in the priority queue: "+nums.toString());
        System.out.println("First element removed in the priority queue: "+nums.poll());
        
        nums.add(5);
        System.out.println("5 has been successfully added to the priority queue.");
        
        System.out.println(Arrays.toString(nums.toArray()));
        System.out.println("First element in the priority queue: "+nums.peek());
        
        System.out.println("Priority queue contains 1: "+nums.contains(1));
        System.out.println("Size of the priority queue: "+nums.size());
        
        while(!nums.isEmpty()){
            System.out.print(nums.poll()+" ");
        }
        System.out.println();
        
        PriorityQueue<Integer> num2=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arrays){
            num2.add(num);
        }
        System.out.print("Priority queue sorted in reversed order: ");
        while(!num2.isEmpty())
            System.out.print(num2.poll()+" ");
        System.out.println();
    }
}
