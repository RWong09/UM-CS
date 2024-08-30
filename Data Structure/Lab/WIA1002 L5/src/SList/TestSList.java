/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

/**
 *
 * @author HP
 */
public class TestSList {
    public static void main(String[] args) {
        SList<String> mylist=new SList<>();
        mylist.appendEnd("Linked list");
        mylist.appendEnd("is");
        mylist.appendEnd("easy.");
        mylist.display();
        
        System.out.println(mylist.removeInitial());
        
        System.out.print("\"difficult\" is in the list: ");
        System.out.println(mylist.contains("difficult"));
        
        mylist.clear();
    }
}
