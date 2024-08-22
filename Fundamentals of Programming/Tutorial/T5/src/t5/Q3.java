/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5;

/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        //Q3:Determine the values of the arrays below
        int[] marks = new int[5];
        int i = 0, j = 1;
        marks[i] = 12;
        marks[j] = marks[i] + 19;
        marks[j-1] = marks[j] * marks [j];
        marks[j*3] = marks[i+1];
        marks[++j] = marks[i]%5;
        marks[2*j] = marks[j-1];
        
        for(i=0;i<marks.length;i++)
        System.out.println(marks[i]);
    }
}
