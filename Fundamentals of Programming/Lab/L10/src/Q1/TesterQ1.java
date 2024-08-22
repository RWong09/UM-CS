/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author HP
 */
public class TesterQ1 {
    public static void main(String[] args) {
        PermanentEmployee Alice=new PermanentEmployee("Alice",'A');
        PermanentEmployee Ben=new PermanentEmployee("Ben",'B');
        PermanentEmployee Chen=new PermanentEmployee("Chen",'C');
        ContractStaff AhChoy=new ContractStaff("Ah Choy",5000);
        TemporaryStaff Saw=new TemporaryStaff("Saw",60);
        System.out.println(Alice);
        System.out.println(Ben);
        System.out.println(Chen);
        System.out.println(AhChoy);
        System.out.println(Saw);
    }
}
