/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l7;
import java.io.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        //Q1
        createdatfile();
        searchcourse();
    }
    
    static void createdatfile(){
        try{
            File course= new File("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\coursename.dat");
            String[][]cour={
                {"WXES1116","Programming I"},
                {"WXES1115","Data Structure"},
                {"WXES1110","Operating System"},
                {"WXES1112","Computing Mathematics I"}
            };
            ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\coursename.dat"));
            for (int i = 0; i < cour.length; i++)
                for (int k = 0; k < cour[i].length; k++){
                    out.writeUTF( cour[i][k] );
            }

            out.close();
        }
        catch(IOException e){
            System.out.println("IO error: "+ e.getMessage());
        }
    }
    
     static void searchcourse() {
        Scanner sc = new Scanner(System.in);
        String courseCode=null, courseName=null;
        boolean courseFound = false;

        // obtain input from user
        System.out.print("Enter course code: ");
        String inputCourseCode = sc.next();

        // open dat file
        try {
            ObjectInputStream in = new ObjectInputStream( new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab07\\coursename.dat") );

            // read file until end of file
            try {
                while (true){
                    courseCode = in.readUTF();
                    courseName = in.readUTF();

                    // course found
                    if (courseCode.equals(inputCourseCode)){
                        courseFound = true;
                        break;
                    }
                }
            }
            catch (EOFException e){
                System.out.println("EO error: "+e.getMessage());
            }

            in.close();
        }
        catch (IOException e ){
            System.out.println("Problem with dat file input.");
        }


        // print course code if courseFound
        if (courseFound)
            System.out.println("The name is: " + courseName);
        else
            System.out.println("Course not found");
    }
}
