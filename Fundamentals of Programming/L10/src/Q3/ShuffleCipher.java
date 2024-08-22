/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;
import Q2.MessageEncoder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ShuffleCipher implements MessageEncoder{
    String inputFileName;
    String outputFileName;
    int N;
    
    public ShuffleCipher(String inputFileName, String outputFileName, int N){
        this.inputFileName=inputFileName;
        this.outputFileName=outputFileName;
        this.N=N;
    }
    
    public void shuffleToCipher(){
        try{
            File shuffle=new File("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\shufflecipher.txt");
            if(shuffle.createNewFile()){
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
            Scanner gettext=new Scanner(new FileInputStream(inputFileName));
            PrintWriter write=new PrintWriter(new FileOutputStream(outputFileName));
            
            do{
                write.println(Encoder(gettext.nextLine()));
            }while(gettext.hasNextLine());
            
            gettext.close();
            write.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public void Ciphertoshuffle(){
        try{
            File shuffle=new File("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\shuffleplain.txt");
            if(shuffle.createNewFile()){
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
            Scanner gettext=new Scanner(new FileInputStream(inputFileName));
            PrintWriter write=new PrintWriter(new FileOutputStream(outputFileName));
            
            do{
                write.println(Decoder(gettext.nextLine()));
            }while(gettext.hasNextLine());
            
            gettext.close();
            write.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public String Encoder(String plaintext){
        int half=plaintext.length()/2;
        String ciphertext="";
        for(int shuffle=0;shuffle<N;shuffle++){
            ciphertext="";
            for(int i=0;i<half;i++){
                ciphertext+=""+plaintext.charAt(i)+plaintext.charAt(i+half);
                System.out.println("Encode: "+plaintext);
            }
            if(plaintext.length()%2==1)
                ciphertext+=plaintext.charAt(plaintext.length()-1);
            plaintext=ciphertext;
        }
        return ciphertext;
    }
    
    public String Decoder(String ciphertext){
        String plaintext="";
        for(int shuffleback=0;shuffleback<N;shuffleback++){
            plaintext="";
            for(int i=0;i<ciphertext.length()-1;i+=2){
                plaintext+=ciphertext.charAt(i);
                System.out.println("First for: "+plaintext);
            }
            for(int j=1;j<ciphertext.length();j+=2){
                plaintext+=ciphertext.charAt(j);
                System.out.println("Second for: "+plaintext);
            }
            if(ciphertext.length()%2==1){
                plaintext+=ciphertext.charAt(ciphertext.length()-1);
                System.out.println("Final: "+plaintext);
            }
            ciphertext=plaintext;
        }
        return plaintext;
    }
}
