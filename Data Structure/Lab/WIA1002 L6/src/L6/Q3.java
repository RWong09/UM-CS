/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L6;
import java.util.Stack;
/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        Stack<Integer> S=new Stack<>();
        S.push(4);
        S.push(6);
        S.push(3);
        S.push(9);
        S.push(7);
        S.push(12);
        System.out.println("Stack: "+S);
        System.out.println("Sum of the stack: "+sum(S));
    }
    
    public static int sum(Stack<Integer> S){
        int total=0;
        while(!S.empty())
            total+=S.pop();
        return total;
    }
}
