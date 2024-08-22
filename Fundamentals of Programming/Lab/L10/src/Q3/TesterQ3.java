/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author HP
 */
public class TesterQ3 {
    public static void main(String[] args) {
        ShuffleCipher first=new ShuffleCipher("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\Plaintext.txt","C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\shufflecipher.txt",2);
        first.shuffleToCipher();
        
        ShuffleCipher last=new ShuffleCipher("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\shufflecipher.txt","C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\shuffleplain.txt",2);
        last.Ciphertoshuffle();
    }
}
