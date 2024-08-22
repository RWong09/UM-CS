/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5;

/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        //Q4:Determine the occurance of the word "the"
        int counter=0;
        String[]sentence={"the","car","is","broken","please","fix","the","car","immediately"};
        for(int l=0;l<sentence.length;l++)
        {String name="the";
        if(sentence[l]==name)
        counter++;
        }
        System.out.println("The number of the occurance of the word \"the\" is: "+counter);
    }
}
