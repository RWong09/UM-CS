/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L4;

/**
 *
 * @author HP
 */
public class TestLinkedList {
    public static void main(String[] args) {
        //a)
        MyLinkedList<Character> mylist=new MyLinkedList<>();
        mylist.addFirst('a');
        mylist.addLast('b');
        mylist.addLast('c');
        mylist.addLast('d');
        mylist.addLast('e');
        
        //b)
        mylist.print();
        
        System.out.println();
        //c)
        mylist.reverse();
        
        System.out.println();
        //d)
        int size=mylist.lastindexOf(mylist.getLast());
        System.out.println("The number of elements in this list is: "+size);
        
        System.out.println();
        //e)
        System.out.println("The first value of the list is: "+mylist.getFirst());
        System.out.println("The last value of the list is: "+mylist.getLast());
        
        System.out.println();
        //f)
        mylist.remove(2);
        System.out.println("The element of the list has been successfully deleted.");
        mylist.print();
        
        System.out.println();
        //g)
        System.out.println("The second value of the list is: "+mylist.get(1));
        System.out.println("The third value of the list is: "+mylist.get(2));
        
        System.out.println();
        //h)
        System.out.print("The list contains the letter 'c': ");
        System.out.println(mylist.contains('c'));
        
        System.out.println();
        //i)
        mylist.set(0, 'j');
        mylist.set(1, 'a');
        mylist.set(2, 'v');
        mylist.set(3, 'a');
        mylist.print();
        
        //Fun bonus
        mylist.addLast('S');
        mylist.addLast('I');
        mylist.addLast('U');
        mylist.addLast('!');
        mylist.addLast('!');
        mylist.addLast('!');
        
        System.out.println();
        System.out.println("CR7: "+mylist.get(4)+mylist.get(5)+mylist.get(6)+mylist.get(7)+mylist.get(8)+mylist.getLast());
    }
}
