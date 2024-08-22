/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class L3Q6 {
    public static void main(String[] args) {
        Scanner ra=new Scanner(System.in);
        System.out.print("Enter the radius of a circle:");
        double radius,distance,d;
        int x,y;
        radius=ra.nextDouble();
        System.out.print("Enter a x-coordinate:");
        x=ra.nextInt();
        System.out.print("Enter a y-coordinate:");
        y=ra.nextInt();
        d=Math.pow(x, 2) + Math.pow(y, 2);
        distance=Math.sqrt(d);
        System.out.println("Distance : " + distance);
        if (distance <= radius)
        System.out.println("The point ("+x+","+y+") is inside the circle centered at(0,0)");
        else
        System.out.println("The point ("+x+","+y+") is outside the circle centered at(0,0)");         
    }
}
