/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author HP
 */
public class TemporaryStaff extends Employee{
    private int hours;
    
    public TemporaryStaff(String name,int hours){
        super(name,"Temporary Staff");
        this.hours=hours;
    }
    
    @Override
    protected double FindSalary(){
        return 15*hours;
    }
}
