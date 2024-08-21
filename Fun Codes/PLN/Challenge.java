/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLN;
import java.util.*;
/**
 *
 * @author HP
 */
public class Challenge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int i=1;
        int[] arr=new int[T];
        while(i<=T){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                int largest=b;
                for(int x=largest;x>=1;x--){
                    if(a%x==0 && b%x==0){
                        arr[i-1]=x;
                        break;
                    }
                }
            }
            else if(b>a){
                int largest=a;
                for(int x=largest;x>=1;x--){
                    if(a%x==0 && b%x==0){
                        arr[i-1]=x;
                        break;
                    }
                }
            }
            else
                System.out.println(a);
            i++;
        }
        for(int j:arr)
            System.out.println(j);
    }
}
