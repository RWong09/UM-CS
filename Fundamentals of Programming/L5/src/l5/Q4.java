/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l5;

/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        //Q4:Rotate the matrix by 90 degrees clockwise
        int[][] mat=new int[3][3];
        mat[0][0]=1;
        mat[0][1]=5;
        mat[0][2]=7;
        mat[1][0]=3;
        mat[1][1]=6;
        mat[1][2]=9;
        mat[2][0]=5;
        mat[2][1]=3;
        mat[2][2]=8;
        System.out.println("3 by 3 matrix");
        for(int x=0;x<mat.length;x++){
            for(int y=0;y<mat[x].length;y++){
                System.out.print(mat[x][y]+" ");
            }
            System.out.println();
        }

        int[][]rotatedmat=new int[3][3];
        System.out.println("After rotates 90 degrees clockwise");
        
        for(int x=0;x<mat.length;x++){
            for(int y=0;y<mat[x].length;y++){
                rotatedmat[x][y]=mat[2-y][x];
                System.out.print(rotatedmat[x][y]+" ");
            }
            System.out.println();
        }
    }
}
