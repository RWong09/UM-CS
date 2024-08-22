/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6;

/**
 *
 * @author HP
 */
public class Q2 {
    public static void descending(int a, int b, int c) {
        if(a>b){
            if(a>c && b>c)
                System.out.println(a+","+b+","+c);
            else if(a>c && b<c)
                System.out.println(a+","+c+","+b);
            else
                System.out.println(c+","+a+","+b);
        }
        else{
            if(b>c && a>c)
                System.out.println(b+","+a+","+c);
            else if(b>c && a<c)
                System.out.println(b+","+c+","+a);
            else
                System.out.println(c+","+b+","+a);
        }
    }    
}
