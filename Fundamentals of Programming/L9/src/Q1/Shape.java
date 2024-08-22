/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Q1;

public class Shape {
private double area;
private double perimeter;
private String name;

    public void setPerimeter(double perimeter){
        this.perimeter=perimeter;
    }

    public void setArea(double area){
        this.area=area;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getPerimeter(){
        return perimeter;
    }
    
    public double getArea(){
        return area;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return String.format("Name: %s\nPerimeter: %.2f\nArea: %.2f", name,perimeter,area);
    }
}
