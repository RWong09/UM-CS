/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author HP
 */
public class PersonProfile {
    protected String name;
    protected String gender;
    protected String dateofbirth;
    
    public PersonProfile(String name, String gender, String dateofbirth){
        this.name=name;
        this.gender=gender;
        this.dateofbirth=dateofbirth;
    }
    
    @Override
    public String toString(){
        return String.format("Name: %s\nGender: %s\nDate of birth: %s", name,gender,dateofbirth);
    }
}
