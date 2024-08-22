/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l6;

/**
 *
 * @author HP
 */
public class Q1 {
    public static void main(String[] args) {
        //Q1:Find the first 20 triangular number
        Tri(20);
    }
    
    static void Tri(int n){
        int sum=0,x=1;
        for(int a=0;a<n;a++){
            System.out.print(sum+" ");
            sum+=x;
            x++;
        }
        System.out.println();
    }
    
}
