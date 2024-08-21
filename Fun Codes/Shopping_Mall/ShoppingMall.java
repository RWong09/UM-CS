/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shopping_Mall;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class ShoppingMall {
    public static void main(String[] args) {
        FoodStore McDonalds = new FoodStore("McDonalds", new Person("Mike","0101122334"));
        McDonalds.AddMenu("Burger",10);
        McDonalds.AddMenu("Fried Chicken", 12);
        String[] Macemployees={"Jack","Jane"};
        McDonalds.addEmployees(Macemployees);

        FoodStore SushiMentai = new FoodStore("Sushi Mentai", new Person("Max", "0112233445"));
        SushiMentai.AddMenu("Chicken Katsu Don", 15);
        SushiMentai.AddMenu("Ramen", 12);
        String[] Mentaiemployees={"Adam","Alex","Andrew"};
        SushiMentai.addEmployees(Mentaiemployees);

        FoodStore Penyet = new FoodStore("Waroeng Penyet",new Person("Mike","0101122334"));
        Penyet.AddMenu("Ayam Penyet", 10);
        String[] Penyetemployees={"Lex","Leon"};
        Penyet.addEmployees(Penyetemployees);

        FashionStore Uniqlo = new FashionStore("Uniqlo", new Person("Nate", "01999887765"));
        Uniqlo.AddClothes("Shirt", 80);
        Uniqlo.AddClothes("T-Shirt", 60);
        String[] Uniemployees={"Kate","Ken","Kurt"};
        Uniqlo.addEmployees(Uniemployees);

        FashionStore Padini = new FashionStore("Padini", new Person("Nick", "0195544332"));
        Padini.AddClothes("Blouse", 100);
        Padini.AddClothes("Shirt", 80);
        String[] Padiniemployees={"Frank","Felix"};
        Padini.addEmployees(Padiniemployees);

        FashionStore Mango = new FashionStore("Mango", new Person("Nicole", "0194433221"));
        Mango.AddClothes("Dress", 120);
        String[] Mangoemployees={"Ron","John"};
        Mango.addEmployees(Mangoemployees);
        
        FoodStore[] foodstores = {McDonalds,SushiMentai,Penyet};
        FashionStore[] fashionstores = {Uniqlo, Padini, Mango};

        System.out.println(foodstores[1]+"\n");
        System.out.println(fashionstores[2]+"\n");;

        System.out.printf("Food store with highest number of employees: %s\n", FindMax(foodstores).getname());
        System.out.printf("Fashion store with highest number of employees: %s\n", FindMax(fashionstores).getname());
        System.out.println();
        System.out.printf("The contact person for McDonalds and Sushi Mentai is %s\n", McDonalds.equals(SushiMentai)? "same": "different");
        System.out.printf("The contact person for McDonalds and Waroeng Penyet is %s\n", McDonalds.equals(Penyet)? "same": "different");
        System.out.printf("The contact person for Sushi Mentai and Waroeng Penyet is %s\n", SushiMentai.equals(Penyet)? "same": "different");
        System.out.println();
        if(SushiMentai.getNumOfEmployees()>Penyet.getNumOfEmployees()){
            System.out.println("Sushi Mentai have more employees than Waroeng Penyet");
        }
        else if(SushiMentai.getNumOfEmployees()==Penyet.getNumOfEmployees()){
            System.out.println("Both Sushi Mentai and Waroeng Penyet have same number of employees");
        }
        else
            System.out.println("Waroeng Penyet have more employees than Sushi Mentai");
        System.out.println();
        System.out.println("The most expensive item in McDonalds is "+getmostexpensiveitem(McDonalds));
        System.out.println("The most expensive item in Padini is "+getmostexpensiveitem(Padini));
    }

    public static <T extends Comparable<T>> T FindMax(T[] arr) {
        T maxstore = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(maxstore) > 0) {
                maxstore = arr[i]; 
            }
        }
        return maxstore;
    }
    
    public static <E extends ShopLot> String getmostexpensiveitem(E ShopLot){
        ArrayList<Item> items=ShopLot.getItems();
        int max=0;
        int maxprice=0;
        for(int i=0;i<items.size();i++){
            int price=(int)items.get(i).getPrice();
            if(price>maxprice){
                max=i;
                maxprice=price;
            }
        }
        return (String)items.get(max).getitem();
    }
}
