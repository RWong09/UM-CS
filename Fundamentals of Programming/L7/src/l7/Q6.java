/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l7;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q6 {
    public static void main(String[] args) {
        //Q6
        int numofpro= getnumofpro();
        System.out.println("The total number of products is:"+numofpro);
        
        try{
            System.out.printf("%-20s%-25s%-20s%-20s%-20s\n","ProductID","ProductName","Quantity","PricePerUnit","Total");
            Scanner proID=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\product.txt"));
            Scanner orID=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\order.txt"));
            
            String[][] product=new String[numofpro][];
            for(int i=0;i<numofpro;i++){
                product[i]=proID.nextLine().split(",");
            }
            
            while(orID.hasNextLine()){
                String[] order=orID.nextLine().split(",");
                
                for(String[] products: product){
                    if(products[0].equals(order[1])){
                        double total=Double.parseDouble(order[2])*Double.parseDouble(products[2]);
                        System.out.printf("%-20s%-25s%-20s%-20s%-20.2f\n",products[0],products[1], order[2], products[2], total);
                        break;
                    }
                }
            }
            proID.close();
            orID.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
    
    static int getnumofpro(){
        int numofpro=0;
        try{
            Scanner pro=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\product.txt"));
            
            while(pro.hasNextLine()){
                numofpro++;
                pro.nextLine();
            }
            pro.close();
        }
        catch(IOException e){
            System.out.println("IO error: "+e.getMessage());
        }
        return numofpro;
    }
}
