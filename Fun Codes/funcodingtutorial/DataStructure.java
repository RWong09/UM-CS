/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcodingtutorial;
import java.util.Scanner;

public class DataStructure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean fail=true;
        while(fail){
            fail=Sem1();
        }
        System.out.println();
        System.out.println("Next semester...");
        System.out.println();
        fail=true;
        while(fail){
            fail=Sem2();
        }
    }
    
    static boolean Sem1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your grade for FOP: ");
        String grade=sc.nextLine();
        if(grade.equals("C-") || grade.equals("D+") || grade.equals("D") || grade.equals("F")){
            System.out.println("You have not passed your Fundamentals of Programming!");
            System.out.println("You are not allowed to take Data Structure for next semester.");
            return true;
        }
        else{
            System.out.println("Congratulations for passing your Fundamentals of Programming!");
            System.out.println("You are allowed to take Data Structure for next semester.");
            return false;
        }
    }
    
    static boolean Sem2(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your grade for Data Structure: ");
        String grade=sc.nextLine();
        if(grade.equals("C-") || grade.equals("D+") || grade.equals("D") || grade.equals("F")){
            System.out.println("You have not passed your Data Structure!");
            System.out.println("You are not allowed to take Algorithm Design and Analysis for next semester.");
            System.out.println("For CSN and DS students, please retake this subject!");
            return true;
        }
        else{
            System.out.println("Congratulations for passing your Data Structure!");
            System.out.println("You are allowed to take Algorithm Design and Analysis for next semester.");
            System.out.println("For CSN and DS students, you are now free to take other courses for the rest "
                    + "of your semesters! Good luck!");
            return false;
        }
    }
}
