/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q8;
import java.util.ArrayList;

public class Q8 {
    public static void displayList(ArrayList<?> list) {
        for(int i=0;i<list.size();i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> numOfCars=new ArrayList<>();
        ArrayList<Double> milesPerHour=new ArrayList<>();
        displayList(numOfCars);
        displayList(milesPerHour);
    }
}
