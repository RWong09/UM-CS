/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T10;

/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        System.out.println(Calculate(5));
    }
    
    static int Calculate(int n){
        if(n==1)
            return 1;
        else
            return n+Calculate(n-1);
    }
}
