/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Student extends PersonProfile{
    private String[] coursename;
    private String[] coursecode;
    private int[] session;
    private int[] semester;
    private int[] mark;
    protected String filename;
    
    public Student(String name, String gender, String dateofbirth, String filename){
        super(name,gender,dateofbirth);
        this.filename=filename;
        
        try{
            Scanner get=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab09\\course.txt"));
            int lines=0;
            while(get.hasNextLine()){
                get.nextLine();
                lines++;
            }
            get.close();
            
            int courses=lines/5;
            coursename=new String[courses];
            coursecode=new String[courses];
            session=new int[courses];
            semester=new int[courses];
            mark=new int[courses];
            
            Scanner getinfo=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab09\\course.txt"));
            for(int i=0;getinfo.hasNextLine();i++){
                coursecode[i]=getinfo.nextLine();
                coursename[i]=getinfo.nextLine();
                session[i]=getinfo.nextInt();
                semester[i]=getinfo.nextInt();
                mark[i]=getinfo.nextInt();
                if(getinfo.hasNextLine())
                    getinfo.nextLine();
            }
            getinfo.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
    
    public String getGrade(int mark){
        if(mark>=85)
            return "A";
        if(mark>=75)
            return "A-";
        if(mark>=70)
            return "B+";
        if(mark>=65)
            return "B";
        if(mark>=60)
            return "B-";
        if(mark>=55)
            return "C+";
        if(mark>=50)
            return "C";
        if(mark>=45)
            return "D";
        if(mark>=35)
            return "E";
        return "F";
    }
    
    public String toString(){
        String s= super.toString()+"\n";
        for(int i=0;i<coursecode.length;i++){
            s+= "\nCourse name: "+ coursename[i]+
                    "\nCourse code: "+coursecode[i]+
                    "\nSession: "+session[i]+
                    "\nSemester: "+semester[i]+
                    "\nMark: "+mark[i]+
                    "\nGrade: "+getGrade(mark[i])+"\n";
        }
        return s.substring(0, s.length()-1);
    }
}
