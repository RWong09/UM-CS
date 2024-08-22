/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
        
/**
 *
 * @author HP
 */
public class Lecturer extends PersonProfile{
    private String[] coursename;
    private String[] coursecode;
    private int[] semester;
    private int[] session;
    private double[] credit;
    private int[] registered;
    
    public Lecturer(String name,String gender,String dateofbirth){
        super(name,gender,dateofbirth);
        
        try{
            Scanner get=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab09\\lecturer.txt"));
            int lines=0;
            while(get.hasNextLine()){
                get.nextLine();
                lines++;
            }
            get.close();
            
            int courses=lines/6;
            coursename=new String[courses];
            coursecode=new String[courses];
            semester=new int[courses];
            session=new int[courses];
            credit=new double[courses];
            registered=new int[courses];
            
            Scanner getinfo=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab09\\lecturer.txt"));
            for(int i=0;getinfo.hasNextLine();i++){
                coursecode[i]=getinfo.nextLine();
                coursename[i]=getinfo.nextLine();
                session[i]=getinfo.nextInt();
                semester[i]=getinfo.nextInt();
                credit[i]=getinfo.nextInt();
                registered[i]=getinfo.nextInt();
                if(getinfo.hasNextLine())
                    getinfo.nextLine();
            }
            getinfo.close();
            computecredithour();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
    
    public void computecredithour(){
        for(int i=0;i<credit.length;i++){
            int numberofstudents=registered[i];
            
            if(numberofstudents>=150)
                credit[i]=credit[i]*3;
            else if(numberofstudents>=100 && numberofstudents<150)
                credit[i]=credit[i]*2;
            else if(numberofstudents>=50 && numberofstudents<100)
                credit[i]=credit[i]*1.5;
            else
                credit[i]=credit[i]*1;
        }
    }
    
    @Override
    public String toString(){
        String s=super.toString()+"\n";
        for(int i=0;i<coursecode.length;i++){
            s+="\nCourse name: "+coursename[i]+
                    "\nCourse code: "+coursecode[i]+
                    "\nSession: "+session[i]+
                    "\nSemester: "+semester[i]+
                    "\nNumber of registered students: "+registered[i]+
                    "\nCredit hours(updated): "+credit[i]+"\n";
        }
        return s.substring(0, s.length()-1);
    }
}
