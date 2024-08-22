/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author HP
 */
public class TesterQ2 {
    public static void main(String[] args) {
        SubstitutionCipher test=new SubstitutionCipher("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\plaintext.txt",
                "C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\plaintoCipher",-3);
        test.plaintoCipher();
        System.out.println("Successful.");
        
        SubstitutionCipher test1=new SubstitutionCipher("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\plaintoCipher.txt",
                "C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\Ciphertoplain.txt",-3);
        test1.Ciphertoplain();
        System.out.println("Successful.");
    }    
}
