/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author HP
 */
public class FindMax{
    public static void main(String[] args) {
        Integer[] a={1,2,3};
        String[] b={"red","green","blue"};
        Circle[] c={new Circle(3),new Circle(2.9),new Circle(5.9)};   
            
        System.out.println(max(a));
        System.out.println(max(b));
        System.out.println(max(c));
    }
        
    public static <E extends Comparable<E>> E max(E[] list){
        E max=list[0];
        for(E e:list){
            if(e.compareTo(max)>0)
                max=e;
            }
        return max;
        }
    }
    
    class Circle implements Comparable<Circle>{
        private double radius;
        
        public Circle(double radius){
            this.radius=radius;
        }
        
        @Override
        public int compareTo(Circle that) {
            return Double.compare(radius, that.radius);
        }

        @Override
        public String toString() {
            return "Circle "+radius;
        }
    }

