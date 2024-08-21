/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLN;
import java.util.Scanner;

public class Seating{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        test(t);
    }

    static void test(int t){
        Scanner sc=new Scanner(System.in);
        int i=0;
        int[] mintable=new int[t];
        while(i<t){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            mintable[i]=findmintable(a,b,c);
            i++;
        }
        for(int l:mintable){
            System.out.println(l);
        }
    }

    static int findmintable(int a, int b, int c){
        int min=0;
        min+=a;
        if(b%3==1 && c<2){
            return -1;
        }
        else if(b%3==2 && c<1){
            return -1;
        }
        switch(b%3){
            case 1:
                b+=2;
                c-=2;
                min+=b/3;
            case 2:
                b+=1;
                c-=1;
                min+=b/3;
            default:
                min+=b/3;
        }
        switch(c%3){
            case 1:
                min+=(c/3);
                return min;
            case 2:
                min+=(c/3);
                return min;
            default:
                min+=c/3;
                return min;
        }
    }
}

