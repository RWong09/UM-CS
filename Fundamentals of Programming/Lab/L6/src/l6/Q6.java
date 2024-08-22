/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l6;

/**
 *
 * @author HP
 */
public class Q6 {
    public static void main(String[] args) {
        int counter1=0,counter2=0;
        System.out.print("The first 20 palindromic prime numbers are: ");
        
        int a=2;
        while(counter1<20){
            if(pal(a)==true){
                counter1++;
                System.out.print(a+" ");
            }
            a++;
        }
        System.out.println();
        
        a=11;
        System.out.print("The first 20 emirp numbers are: ");
        while(counter2<20){
            if(emirp(a)==true){
                counter2++;
                System.out.print(a+" ");
            }
        a+=2;
        }
        System.out.println();
    }
        
    static boolean pal(int y){
        int rev=0,ori=y;
        boolean palin;
        
        while(y!=0){
            int digit=y%10;
            rev=rev*10+digit;
            y/=10;
        }
       
        if(rev==ori){
            if(Prime(rev)==true)
                palin=true;
            else
                palin=false;
        }
        else
            palin=false;
            return palin;
    }
    
    static boolean emirp(int z){
        int rev=0,digit,ori=z;
        while(z!=0){
            digit=z%10;
            rev=rev*10+digit;
            z/=10;
        }
        
        return Prime(rev) && Prime(ori) && rev!=ori;
    }
    
        static boolean Prime(int x){
        boolean isitPrime=true;
        if(x<2)
            isitPrime=false;
        for(int z=2;z<x;z++){
            if(x%z==0)
                return false;
        }
        return isitPrime;
    }
}
