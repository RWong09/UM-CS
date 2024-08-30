/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L8;
import java.util.Queue;
/**
 *
 * @author HP
 */
public class TestComparableBook {
    public static void main(String[] args) {
        Queue<ComparableBook> BookQueue = new java.util.PriorityQueue<>();
        BookQueue.add(new ComparableBook(1065, "Effective Java: Third Edition"));
        BookQueue.add(new ComparableBook(3012, "Java: A Beginner Guide Seventh Edition"));
        BookQueue.add(new ComparableBook(1097, "Learn Java in One Day and Learn It Well"));
        BookQueue.add(new ComparableBook(7063, "Beginning Programming with Java (Dummies)"));
        BookQueue.add(new ComparableBook(6481, "Java: Programming Basic for Absolute Beginner"));
        System.out.println(BookQueue);
        while (BookQueue.peek() != null) {
            System.out.println("Head Element: " + BookQueue.peek());
            BookQueue.remove();
            System.out.println("Priority queue: " + BookQueue);
        }
    }
}

class ComparableBook implements Comparable<ComparableBook>{
    private int ID;
    private String bookname;
    
    public ComparableBook(int ID,String bookname){
        this.ID=ID;
        this.bookname=bookname;
    }
    
    @Override
    public int compareTo(ComparableBook books){
        if(this.ID>books.ID)
            return 1;
        else if(this.ID<books.ID)
            return -1;
        return 0;
    }
    
    @Override
    public String toString(){
        return String.format("%d, %s", ID,bookname);
    }
}
