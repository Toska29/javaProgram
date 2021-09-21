package checkout;

import java.util.Scanner;

public class Item {
    private String itemName;
    private int quantity;
    private double price;
    private double totalPrice;

    public Item(){

    }

    public Item(String itemName, int quantity, double price, double totalPrice){
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
    }
    public void itemName(String name){
        itemName = name;
    }

    public String getItemName(){
        return itemName;
    }

    public void quantityOfItem(int quantity){
        this.quantity = quantity;
    }
    public void price(double price){
        this.price = price;
    }
    public void setTotalPrice(){
        totalPrice = quantity * price;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    @Override
    public String toString() {
        return String.format("%-10s%5s%d%5s%.2f%5s%.2f", itemName, "", quantity, "", price, "", totalPrice);
    }
}
