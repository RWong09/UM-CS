/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author HP
 */
public class ContractStaff extends Employee{
    private double totalsales;
    
    public ContractStaff(String name,double totalsales){
        super(name,"Contract Staff");
        this.totalsales=totalsales;
    }
    
    @Override
    protected double FindSalary(){
        return 500+(0.5*totalsales);
    }
}
