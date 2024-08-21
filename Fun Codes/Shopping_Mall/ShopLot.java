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
public class ShopLot{
    protected String shopname;
    protected Person Contactperson;
    private final ArrayList<Person> employees;
    
    public ShopLot(String shopname, Person Contactperson){
        this.shopname=shopname;
        this.Contactperson=Contactperson;
        this.employees=new ArrayList<>();
    }
    
    public String getname(){
        return shopname;
    }
    
    public Person getContactperson(){
        return Contactperson;
    }
    
    public int getNumOfEmployees(){
        return employees.size();
    }
    
    public void addEmployees(String[] employees){
        for(String e:employees){
            this.employees.add(new Person(e,null));
        }
    }
    
    public ArrayList<Item> getItems() {
        return null;
    };

    @Override
    public String toString() {
        return "ShopLot{" +
                "shopName='" + shopname + '\'' +
                ", contact=" + Contactperson +
                ", employees=" + employees +
                '}';
    }
}

class Person{
    private String name;
    private String contact;
    
    public Person(String name, String contact){
        this.name=name;
        this.contact=contact;
    }
    
    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString(){
        return "Person{" +
                "name='" + name + '\'' +
                ", contactNo='" + contact+ '\'' +
                '}';
    }
}

class Item<T>{
    private T item;
    private T price;
    
    public Item(T item,T price){
        this.item=item;
        this.price=price;
    }
    
    public void setItem(T item){
        this.item=item;
    }
    
    public void setPrice(T price){
        this.price=price;
    }
    
    public T getitem(){
        return item;
    }
    
    public T getPrice(){
        return price;
    }
    
    @Override
    public String toString(){
        return "Item{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}

class FoodStore extends ShopLot implements Comparable<FoodStore>{
    private ArrayList<Item> menu;
    
    public FoodStore(String shopname,Person Contactperson){
        super(shopname,Contactperson);
        this.menu=new ArrayList<>();
    }
    
    public void AddMenu(String item, int price){
        menu.add(new Item(item,price));
    }
    
    @Override
    public int compareTo(FoodStore o){
        if(this.getNumOfEmployees()>o.getNumOfEmployees()){
            return 1;
        }
        else if(this.getNumOfEmployees()<o.getNumOfEmployees()){
            return -1;
        }
        else
            return 0;
    }
    
    @Override
    public boolean equals(Object o){
        FoodStore that=(FoodStore) o;
        return this.Contactperson.getName().equals(that.Contactperson.getName())&& this.Contactperson
                .getContactNumber().equals(that.Contactperson.getContactNumber());
    }
    
    @Override
    public ArrayList<Item> getItems() {
        return menu;
    }
}

class FashionStore extends ShopLot implements Comparable<FashionStore>{
    private ArrayList<Item> clothes;
    
    public FashionStore(String shopname,Person Contactperson){
        super(shopname,Contactperson);
        this.clothes=new ArrayList<>();
    }
    
    public void AddClothes(String item,int price){
        clothes.add(new Item(item,price));
    }
    
    @Override
    public int compareTo(FashionStore o){
        if(this.getNumOfEmployees()>o.getNumOfEmployees()){
            return 1;
        }
        else if(this.getNumOfEmployees()<o.getNumOfEmployees()){
            return -1;
        }
        else
            return 0;
    }
    
    @Override
    public ArrayList<Item> getItems(){
        return clothes;
    }
}