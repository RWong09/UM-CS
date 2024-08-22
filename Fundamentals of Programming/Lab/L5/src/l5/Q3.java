/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        //Q3:Display work hours for each employee
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int th=0;
        System.out.print("Enter the number of employees: ");
        int emp=sc.nextInt();
        System.out.println("The work hours for each employee are as follows:");
        int[][]hours=new int[emp][7];
        for(int k=0;k<hours.length;k++){
            int l=k+1;
            System.out.print("Employee "+l+": ");
            for(int m=0;m<hours[k].length;m++){
                hours[k][m]=r.nextInt(8)+1;
                System.out.print(hours[k][m]+" ");
                th+=hours[k][m];
            }
            System.out.println();
            System.out.print("The total work hours for employee "+l+" is: "+th);
            th=0;
            System.out.println();
        }
    }    
}
