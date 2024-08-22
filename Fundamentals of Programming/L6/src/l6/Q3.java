/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l6;

/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        int[]y={6,7,9,0,1,4,6,7,9,2};
        for(int a: y)
            System.out.print(y[a]);
        System.out.println();
        Rev(y);
    }
    
    public static void Rev(int[]x){
        for(int a=x.length-1;a>=0;a--){
            System.out.print(x[a]);
        }
        System.out.println();
    }
}
