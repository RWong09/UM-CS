/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author HP
 */
public class Square extends Shape{
    private double sidelengths;
    
    public void setSquare(double sidelengths){
        setName("Square");
        this.sidelengths=sidelengths;
        computePeriandArea();
    }
    
    public void computePeriandArea(){
        setPerimeter(4*(sidelengths));
        setArea(sidelengths*sidelengths);
    }
}
