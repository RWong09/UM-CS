package L5;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> list=new LinkedList<>();
        
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        String input;
        while(!((input=sc.nextLine()).equals("n")))
            list.add(input);
        System.out.println();
        
        System.out.println("You have entered the following students' name :");
        list.printList();
        System.out.println();
        
        System.out.println("The number of students entered is : "+list.getSize());
        System.out.println();
        
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, "
                + "'n' to proceed.");
        input=sc.nextLine();
        System.out.println();
        
        if(input.equals("r")){
            System.out.println("Enter the existing student name that u want to rename :");
            String former=sc.nextLine();
            System.out.println();
            System.out.println("Enter the new name :");
            String newname=sc.nextLine();
            System.out.println();
            list.replace(former, newname);
            System.out.println("The new student list is :");
            list.printList();
            System.out.println();
        }
        
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        input=sc.nextLine();
        System.out.println();
        
        if(input.equals("y")){
            System.out.println("Enter a student name to remove :");
            String target=sc.nextLine();
            System.out.println();
            list.removeElement(target);
            System.out.println("The number of updated student is : "+list.getSize());
            System.out.println("The updated students list is :");
            list.printList();
            System.out.println();
        }
        
        System.out.println("All student data captured complete. Thank you!");
    }
}

class LinkedList<E>{
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public static class Node<E>{
        private E item;
        private Node<E> next;
        
        public Node(){
        }
        
        public Node(E item){
            this.item=item;
        }
    }
    
    public void add(E e){
        Node<E> node=new Node<>(e);
        if(tail!=null)
            tail.next=node;
        tail=node;
        if(head==null)
            head=tail;
        size++;
    }
    
    public void removeElement(E e){
        Node<E> dummy=new Node<>();
        dummy.next=head;
        Node<E> current=dummy;
        while(current.next!=null){
            if(e.equals(current.next.item)){
                current.next=current.next.next;
                size--;
            }
            else
                current=current.next;
        }
        head=dummy.next;
        tail=(current==dummy ?null :current);
    }
    
    public void printList(){
        if(size==0)
            System.out.println();
        Node<E> print=head;
        for(int i=0;i<size-1;i++){
            System.out.print(print.item+", ");
            print=print.next;
        }
        System.out.println(print.item+".");
    }
    
    public int getSize(){
        return size;
    }
    
    public boolean contains(E e){
        Node<E> check=head;
        for(int i=0;i<size;i++){
            if(check.equals(e))
                return true;
            check=check.next;
        }
        return false;
    }
    
    public void replace(E e, E newE){
        Node<E> change=head;
        for(int i=0;i<size;i++){
            if(change.item.equals(e))
                change.item=newE;
            change=change.next;
        }
    }
}