/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        System.out.println(permuteString("ABC"));
    }
    
    public static List<String> permuteString(String s) {
        if (s.length() == 0) 
            return List.of("");
        
        char firstChar = s.charAt(0);
        List<String> permutations = permuteString(s.substring(1));
        List<String> list = new ArrayList<>();
        for (String permutation : permutations)
            for (int i = 0; i < s.length(); i++)
                list.add(insert(permutation, firstChar, i));
        return list;
    }

    private static String insert(String s, char c, int index) {
        return s.substring(0, index) + c + s.substring(index);
    }
}
