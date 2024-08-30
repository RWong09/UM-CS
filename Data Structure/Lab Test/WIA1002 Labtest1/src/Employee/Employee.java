/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Employee;

/**
 *
 * @author HP
 */
public abstract class Employee<ID> {
    
public Employee(){
    System.out.println("Constructor 1 is running...");
}

public Employee(ID name){
    System.out.println("Constuctor 2 is running...");
}

public Employee(ID name, ID taxNo){
    System.out.println("Constuctor 3 is running...");
    
}

public Employee(ID name,ID taxNo,ID id){
    System.out.println("Constuctor 4 is running...");
}

public abstract void introduce();
}

class EmployeeTesla<ID> extends Employee<ID>{
    private ID name=(ID)"John Doe"; 
    private ID taxNo=(ID)"9999"; 
    private ID id=(ID)"1111"; 

    public EmployeeTesla(){
        super(); 
        this.name=name;
        this.taxNo=taxNo;
    }
    
    public EmployeeTesla(ID name){
        super(name); 
        this.name = name; 
        this.taxNo=taxNo;
    }

    public EmployeeTesla(ID name, ID taxNo){
        super(name, taxNo); 
        this.name = name; 
        this.taxNo = taxNo; 
    }
    
    public EmployeeTesla(ID name, ID taxNo, ID id){
        super(name, taxNo, id); 
        this.name = name; 
        this.taxNo = taxNo; 
        this.id = id; 
    }

    @Override
    public void introduce(){
        System.out.println("Employee Tesla starts working...");
        System.out.print("My name is " + name + ", my tax no is " + taxNo + ", and my employee ID is ");
        if(id == null){
            System.out.println("1111");
        }
        else {
            System.out.println(id);
        }
        System.out.println("---I am an employee object.---");
        System.out.println();
    }
}

class Main{
    public static void main(String[] args) {
        EmployeeTesla NewGuy=new EmployeeTesla();
        NewGuy.introduce();
        EmployeeTesla Alisa=new EmployeeTesla("Alisa");
        Alisa.introduce();
        EmployeeTesla Adam=new EmployeeTesla("Adam","6541");
        Adam.introduce();
        EmployeeTesla Ali=new EmployeeTesla("Ali","3971","12345");
        Ali.introduce();
    }
}