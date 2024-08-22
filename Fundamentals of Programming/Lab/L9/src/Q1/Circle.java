/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author HP
 */
public class Circle extends Shape{
    private double diameter;
    
    public void setCircle(double diameter){
        setName("Circle");
        this.diameter=diameter;
        computePeriandArea();
    }
    
    public void computePeriandArea(){
        setPerimeter(Math.PI*diameter);
        setArea(Math.PI*Math.pow(diameter/2,2));
    }
}
