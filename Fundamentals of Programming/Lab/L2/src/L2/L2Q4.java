/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class L2Q4 {public static void main(String[] args) {
    //Convert seconds to hours, minutes and seconds;
        Scanner s=new Scanner(System.in);
        int sc,hr,min,sc2;
        System.out.print("Enter the number of seconds: ");
        sc=s.nextInt();
        hr=sc/3600;
        min=sc%3600/60;
        sc2=sc%3600%60;
        System.out.println(sc+" seconds is "+hr+" hours, "+min+" minutes and "+sc2+" seconds");
    }

}
