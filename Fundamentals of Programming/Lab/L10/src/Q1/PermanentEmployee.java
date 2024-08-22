/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author HP
 */
public class PermanentEmployee extends Employee{
    private char category;
    
    public PermanentEmployee(String name, char category){
        super(name,"Permanent Employee");
        this.category=category;
    }
    
    @Override
    protected double FindSalary(){
        return switch(category){
            case 'A'->4000;
            case 'B'->3000;
            case 'C'->2000;
            default->0;
        };
    }
}
