/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2;
import java.util.Random;
/**
 *
 * @author HP
 */
public class L2Q5 {
    public static void main(String[] args) {
        //Q5:Generate and sum all the random numbers
        Random r= new Random();
        int num1= r.nextInt(10001);
        System.out.println(num1);
        int sum=0;
        while (num1>0)
        {sum=sum+(num1%10);
            System.out.println(sum);
         num1=num1/10;       
            System.out.println(num1);
                }
        System.out.println(sum);
    }
    
}
