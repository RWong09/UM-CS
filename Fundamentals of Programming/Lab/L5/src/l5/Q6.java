/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int row=sc.nextInt();
        System.out.println("The Pascal Triangle with "+row+" row(s)");
        
        int[][]Pascal=new int[row][row];
        for(int n=0;n<row;n++){
            Pascal[n][0]=1;
            for(int k=1;k<=n;k++){
                Pascal[n][k]=Pascal[n-1][k-1]+Pascal[n-1][k];
            }
        }
        for(int k=0;k<row;k++){
            for(int m=0;m<row;m++)
                System.out.print(Pascal[k][m]+" ");
            System.out.println();
        }
    }
}
