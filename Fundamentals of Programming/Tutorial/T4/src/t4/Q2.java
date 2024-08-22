/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4;

/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        //Q2: Correct the error
        //2a)
        int sum=0;
        for (int x = 10; x < 100; x++)
        sum += x;    
        System.out.println("The sum is: "+sum);

        //2b)
        int w,y;
        w=0;
        y=0;
        do{
         w += 2;
         y += w;
         System.out.println(w + " and " + y);
        }while (w < 100);
        
        //2c)
        int u,v;
        for(u=1, v=20;u<v; u++, v-=2)
        System.out.println(u+ " " +v);
        
        //2d)
        for(int i=1;i<=10;i++){
        System.out.println("The number is: "+i+".Please continue.");
        if (i==10){
        System.out.println("The program has reached its maximum number!");
        System.out.println("Program End");
        }
        }
    }
}
