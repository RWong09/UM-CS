/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author HP
 */
public class SubstitutionCipher implements MessageEncoder{
    private String inputFileName;
    private String outputFileName;
    private int shift;
    
    public SubstitutionCipher(String inputFileName, String outputFileName,int shift){
        this.inputFileName=inputFileName;
        this.outputFileName=outputFileName;
        this.shift=shift;
    }
    
    public void plaintoCipher(){
        try{
            File plaintoCipher=new File("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\plaintoCipher.txt");
            if(plaintoCipher.createNewFile()){
                System.out.println("File created successfully.");
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException e){
            System.out.println("IO error: "+e.getMessage());
        }
        
        try{
            Scanner input=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\Plaintext.txt"));
            PrintWriter write=new PrintWriter(new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\plaintoCipher.txt"));
            
            do{
                write.println(Encoder(input.nextLine()));
            }while(input.hasNextLine());
            
            input.close();
            write.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
        
    public void Ciphertoplain(){
        try{
            File plaintoCipher=new File("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\Ciphertoplain.txt");
            if(plaintoCipher.createNewFile()){
                System.out.println("File created successfully.");
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException e){
            System.out.println("IO error: "+e.getMessage());
        }
        
        try{
            Scanner input1=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\PlaintoCipher.txt"));
            PrintWriter write1=new PrintWriter(new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\Ciphertoplain.txt"));
            
            do{
                write1.println(Decoder(input1.nextLine()));
            }while(input1.hasNextLine());
            
            input1.close();
            write1.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public String Encoder(String plaintext){
        String ciphertext="";
        for(int i=0;i< plaintext.length();i++){
            ciphertext+=(char)((plaintext.charAt(i)+shift)%256);
        }
        return ciphertext;
    }
    
    public String Decoder(String ciphertext){
        String plaintext="";
        for(int i=0;i<ciphertext.length();i++){
            plaintext+=(char)((ciphertext.charAt(i)-shift)%256);
        }
        return plaintext;
    }
}
