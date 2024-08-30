/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L7;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Q3 {
    static Queue<Integer> shares=new LinkedList<>();
    static Queue<Integer> shareprice=new LinkedList<>();
    static int totalgainloss=0;
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter your query (Buy or Sell): ");
            String query=sc.nextLine();
            if(query.equals("Buy")){
                System.out.print("State the number of shares and prices that you want to buy: ");
                int share=sc.nextInt();
                System.out.print("$");
                int price=sc.nextInt();
                Buy(share,price);
            }
            else if(query.equals("Sell")){
                System.out.print("State the number of shares and prices that you want to sell: ");
                int share=sc.nextInt();
                System.out.print("$");
                int price=sc.nextInt();
                Sell(share,price);
            }
            else if(query.equals("")){
                System.out.println("Final Capital Gain / Loss: "+totalgainloss);
                break;
            }
            else{
                System.out.println("Invalid query! (Hint, please type 'Buy' or 'Sell')");
                continue;
            }
            System.out.println("Queue for Share: Queue: "+shares.toString());
            System.out.println("Queue for Price: Queue: "+shareprice.toString());
            sc.nextLine();
        }
    }
    
    static void Buy(int share,int price){
        System.out.println("Buying now...");
        shares.offer(share);
        shareprice.add(price);
    }
    
    static void Sell(int share, int price){
        System.out.println("Selling now...");
        while(share>0){
            if(shares.isEmpty()){
                System.out.println("No shares to sell!");
                break;
            }
            if(share>=shares.peek()){
                totalgainloss+=shares.peek()*(price-shareprice.poll());
                share-=shares.poll();
            }
            else{
                totalgainloss+=share*(price-shareprice.peek());
                shares.offer(shares.peek()-share);
                shares.poll();
                for(int i=shares.size()-1;i>1;i--)
                    shares.offer(shares.poll());
                share=0;
            }
            System.out.println("Total Capital Gain / Loss: "+totalgainloss);
        }
    }
}
