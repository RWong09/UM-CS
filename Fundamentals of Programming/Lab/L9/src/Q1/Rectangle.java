/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author HP
 */
public class Rectangle extends Shape{
    private double sidelength1;
    private double sidelength2;
    
    public void setRectangle(double sidelength1, double sidelength2){
        setName("Rectangle");
        this.sidelength1=sidelength1;
        this.sidelength2=sidelength2;
        computePeriandArea();
    }
    
    public void computePeriandArea(){
        setPerimeter(2*(sidelength1+sidelength2));
        setArea(sidelength1*sidelength2);
    }
}
