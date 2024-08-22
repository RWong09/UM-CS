/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Q1:Write statements
        //a)Store 12 floating numbers
        double[]floatingpoint=new double[12];
        float[]num3=new float[12];
        
        //b)Store the value from A to E
        String[]name={"A","B","C","D","E"};
        for(int i=0;i<name.length;i++)
        System.out.print(name[i]+" ".repeat(5));
        System.out.println();
        int[]integer={59,69,360,730,999};
        for(int j=0;j<name.length;j++)
        {System.out.printf("%2d",integer[j]);
        System.out.print(" ".repeat(3));
        }
        System.out.println();
        
        //c)Store 100 students name
        String name1[]=new String[100];
        name1[0]="Ah Meng";
        name1[99]="Kah Seng";
        System.out.println(name1[0]+" and "+name1[99]);
        
        //d)A table of 6 rows 2 columns
        Random r=new Random();
        int[][]num=new int[6][2];
        for(int a=0;a<num.length;a++){
            for(int b=0;b<num[a].length;b++){
            num[a][b]=r.nextInt(100)+1;
            System.out.print(num[a][b]+" ");    
            }
            System.out.println();
        }
        
        //e) and f)Initialise an array and modify it
        int[][]num2={{6,9},{2,5},{4,6}};
        for(int a=0;a<num2.length;a++)
        {for(int b=0;b<num2[a].length;b++)
        System.out.print(num2[a][b]+" ");
        System.out.println();
        }
        num2[1][1]=4;
        num2[2][0]=3;
        num2[2][1]=7;
        for(int a=0;a<num2.length;a++)
        {for(int b=0;b<num2[a].length;b++)
        System.out.print(num2[a][b]+" ");
        System.out.println();  
        }
    }   
}
