/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PLN;
import java.util.*;

public class Cake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=0;
        int total=x;
        while(true){
            y++;
            if(n<=0 || x<=1){
                y=-1;
                System.out.println(y);
                break;
            }
            total*=n;
            String leng=Integer.toString(total);
            if(leng.length()==n){
                System.out.println(y);
                break;
            }
        }
    }
}
