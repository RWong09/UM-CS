/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author HP
 */
public class TesterQ4 {
    public static void main(String[] args) {
        Appointment one=new Appointment(19,3,2024,1530,1700);
        one.saveappointment();
        Appointment two=new Appointment(22,3,2024,1600,2000);
        two.saveappointment();
        Appointment three=new Appointment(22,3,2024,1800,2200);
        three.saveappointment();
        Appointment four=new Appointment(25,3,2024,1200,1400);
        four.saveappointment();
        Appointment five=new Appointment(25,3,2024,2000,2200);
        five.saveappointment();
    }    
}
