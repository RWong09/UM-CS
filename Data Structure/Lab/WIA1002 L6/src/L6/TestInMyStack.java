/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L6;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TestInMyStack {
    public static void main(String[] args) {
        MyStack<Integer> user=new MyStack<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an integer value: ");
        int num=sc.nextInt();
        
        for(int i=1;i<=num;i++)
            user.push(i);
        
        System.out.println("The size of the stack is: "+user.getSize());
        
        while(!user.isEmpty()){
            System.out.print(user.pop()+" ");
        }
        System.out.println();
        
        /**
         * Answer: The elements are displayed in descending order. 
         * The elements are displayed in: n,n-1,n-2...2,1.
         * This is because stack is last in, first out data structure.
         * Therefore, the larger numbers are popped out first as they are pushed later compared to smaller numbers.
         */
    }
}
