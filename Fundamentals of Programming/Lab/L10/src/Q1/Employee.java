/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;

/**
 *
 * @author HP
 */
public abstract class Employee {
    protected String name;
    protected String type;
    
    public Employee(String name,String type){
        this.name=name;
        this.type=type;
    }
    
    protected abstract double FindSalary();
    
    @Override
    public String toString(){
        return "Name: "+ name +
                "\nType: "+type +
                String.format("\nSalary: per month: %.2f", FindSalary());
    }
}
