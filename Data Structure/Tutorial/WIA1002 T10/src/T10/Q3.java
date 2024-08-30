/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T10;

/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        System.out.println(Reverse("String"));
    }
    
    static String Reverse(String str){
        if(str.isEmpty())
            return "";
        else
            return Reverse(str.substring(1))+str.charAt(0);
    }
}
