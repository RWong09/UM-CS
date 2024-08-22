/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l6;

/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        multiPrint(5,'c');
    }
    
    static void multiPrint(int n, char c){
        for(int a=0;a<n;a++)
        System.out.println(c);
        
        int m=n;
        for(int a=1;a<=n;a++){
            for(int b=1;b<m;b++){
                System.out.print(" ");
            }
            for(int d=1;d<=2*a-1;d++){
                System.out.print(c);
            }
            System.out.println();
            m--;
        }
        
        System.out.println();
        
        m=n;
        for(int a=1;a<=n;a++){
            for(int b=1;b<m;b++){
                System.out.print(" ");
            }
            for(int d=1;d<=2*a-1;d++){
                System.out.print(c);
            }
            System.out.println();
            m--;
        }
        
        for(int e=n-1;e>0;e--){
            m++;
            for(int f=m;f>0;f--){
                System.out.print(" ");
            }
            for(int d=1;d<=2*e-1;d++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
