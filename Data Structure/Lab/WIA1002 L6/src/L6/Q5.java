/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L6;
import java.util.Stack;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int disks=sc.nextInt();
        System.out.println("Start the game of Hanoi!");
        game(disks);
    }
    
    public static void game(int n){
        int numoftowers=n;
        System.out.println("Game of Hanoi for: "+numoftowers+" disks");
        //From TestMyStack class, can import stack class to do the same
        Stack<Integer> left=new Stack<>();
        Stack<Integer> mid=new Stack<>();
        Stack<Integer> right=new Stack<>();
        for(int i=numoftowers;i>0;i--)
            left.push(i);
        int totalmoves=(int)Math.pow(2, numoftowers)-1;
        display(left, mid, right,numoftowers);
        if(numoftowers%2==1){
            for(int i=1;i<=totalmoves;i++){
                if(i%3==0){
                    moveDisk(mid,right);
                    display(left, mid, right,numoftowers);
                }
                else if(i%3==1){
                    moveDisk(left,right);
                    display(left, mid, right,numoftowers);
                }
                else{
                    moveDisk(left,mid);
                    display(left, mid, right,numoftowers);
                }
            }
        }
        else{
            for(int i=1;i<=totalmoves;i++){
                if(i%3==0){
                    moveDisk(mid,right);
                    display(left, mid, right,numoftowers);
                }
                else if(i%3==1){
                    moveDisk(left,mid);
                    display(left, mid, right,numoftowers);
                }
                else{
                    moveDisk(left,right);
                    display(left, mid, right,numoftowers);
                }
            }    
        }
        System.out.println("The destination stack is: "+right);
        System.out.println("You won!");
    }
    
    public static void moveDisk(Stack<Integer> a,Stack<Integer> b){
        if(b.isEmpty() || (!a.isEmpty() && a.peek()<b.peek())){
            System.out.println("Moving disk: "+a.peek()+" from "+a+" to "+b);
            b.push(a.peek());
            a.pop();
        }
        else
            moveDisk(b,a);
    }
    
    public static void display(Stack<Integer> left,Stack<Integer> mid,Stack<Integer> right,int stacks){
        System.out.println("  A  |  B  |  C  ");
        System.out.println("-----------------");
        for(int i=stacks-1;i>-1;i--){
            String s1=" ",s2=" ",s3=" ";
            try{
                s1=String.valueOf(left.get(i));
            }
            catch(Exception e){
                
            }
            try{
                s2=String.valueOf(mid.get(i));
            }
            catch(Exception e){
                
            }
            try{
                s3=String.valueOf(right.get(i));
            }
            catch(Exception e){
                
            }
            System.out.println("  "+s1+"  |  "+s2+"  |  "+s3);
        }
        System.out.println();
    }
}
