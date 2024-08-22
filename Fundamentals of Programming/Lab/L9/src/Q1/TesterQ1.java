/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class TesterQ1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape random=new Shape();
        System.out.print("What shape do you want? Please enter your preferred shape name: ");
        String name1=sc.nextLine();
        random.setName(name1);
        System.out.print("Please enter the perimeter of your shape: ");
        double peri1=sc.nextDouble();
        random.setPerimeter(peri1);
        System.out.print("Please enter the area of your shape: ");
        double area1=sc.nextDouble();
        random.setArea(area1);
        System.out.println(random);
        
        Rectangle Soon=new Rectangle();
        Soon.setRectangle(15, 9);
        System.out.println(Soon);
        
        Square Sim=new Square();
        Sim.setSquare(8);
        System.out.println(Sim);
        
        Circle Titus=new Circle();
        Titus.setCircle(16);
        System.out.println(Titus);
    }
}
