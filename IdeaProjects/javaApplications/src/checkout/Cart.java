package checkout;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    private ArrayList<Item> items = new ArrayList<>();
    private String cartOwner;

    public void setCartOwner(String name){
        cartOwner = name;
    }

    public void setItems(String itemName, int quantity, double price, double totalPrice){
        Item item = new Item(itemName, quantity, price, totalPrice);
        items.add(item);
    }

    public String getCartOwner(){
        return cartOwner;
    }
    public String toString(){
        String emptyItem = "";
        for(Item item:items){
            emptyItem += item + "\n";
        }
        return emptyItem;
    }
}
