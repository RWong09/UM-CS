/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5;

/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        //2a)
        String[] code = {"AAA", "AAB", "AAC", "AAD"};

        //2b)
        int[] num = new int[10];
        num[0]=20;
        int sum=0;
        for(int k=0; k<num.length; k++)
        sum+=num[k];
        System.out.println(sum);
        
        //2c)
        int[][] t = new int[3][5];
        t[1][2] = 5;

        //2d)
        int i=4;
        int []score = new int[5];
        score [1] = 78;
        score [i] = 100;
    }
}
