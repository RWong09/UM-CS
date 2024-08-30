/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10;

/**
 *
 * @author HP
 */
public class Q1 {
    public static void main(String[] args) {
        System.out.println(substituteAI("flabbergasted"));
        System.out.println(substituteAI("Astronaut"));
    }
    
    static String substituteAI(String s){
        if(s.isEmpty())
            return "";
        else
            return (s.charAt(0)=='a' ? 'i' : s.charAt(0))+substituteAI(s.substring(1));
    }
}
