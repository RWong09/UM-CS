/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Appointment implements Searchable{
    private int day,month,year,Starttime,Endtime;
    
    public Appointment(int day, int month, int year, int Starttime, int Endtime){
        this.day=day;
        this.month=month;
        this.year=year;
        this.Starttime=Starttime;
        this.Endtime=Endtime;
    }
    
    public void saveappointment(){
        try{
            File test=new File("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\appointmentlist.txt");
            if(test.createNewFile()){
                System.out.println("File created successfully.");
            }
            else
                System.out.println("File already exists.");
        }
        catch(IOException e){
            System.out.println("IOerror: "+e.getMessage());
        }
        
        try{
            String dateStarttime=String.format("%d,%d,%d,%d", day,month,year,Starttime);
            String dateEndtime=String.format("%d,%d,%d,%d", day,month,year,Endtime);
            PrintWriter create=new PrintWriter(new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\appointmentlist.txt",true));
            if(search(dateStarttime,dateEndtime)){
                create.printf("%d,%d,%d,%d,%d\n",day,month,year,Starttime,Endtime);
                System.out.println(dateStarttime+" and "+dateEndtime+" is saved.");
            }
            else
                System.out.println(dateStarttime+" and "+dateEndtime+" cannot be saved due to appointment already made on the time.");
            create.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public boolean search(String dateStarttime,String dateEndtime){
        String[] startvalues=dateStarttime.split(",");
        String[] endvalues=dateEndtime.split(",");
        int day=Integer.parseInt(startvalues[0]);
        int month=Integer.parseInt(startvalues[1]);
        int year=Integer.parseInt(startvalues[2]);
        int start=Integer.parseInt(startvalues[3]);
        int end=Integer.parseInt(endvalues[3]);
        
        try{
            Scanner check=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\Lab10\\appointmentlist.txt"));
            while(check.hasNextLine()){
                String[] info=check.nextLine().split(",");
                int a=Integer.parseInt(info[0]);
                int b=Integer.parseInt(info[1]);
                int c=Integer.parseInt(info[2]);
                int d=Integer.parseInt(info[3]);
                int e=Integer.parseInt(info[4]);
                if(day==a && month==b && year==c && ((start<=d && e<=end)||(d<start && start<e)||(d<end && end<e)))
                    return false;
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return true;
    }
    
    @Override
    public String toString(){
        return String.format("Appointment on %d,%d,%d from %d to %d has been successfully booked.", day,month,year,Starttime,Endtime);
    }
}
