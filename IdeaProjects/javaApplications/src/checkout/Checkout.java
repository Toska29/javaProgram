package checkout;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class Checkout {
    public static void main(String[] args) {
        int subTotal = 0;
        String cashierName = "";

        String timestamp = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
        Scanner input = new Scanner(System.in);
        Item item = new Item();
        Cart invoice = new Cart();

        System.out.println("Name of Cashier on duty: ");
        cashierName = input.nextLine();
        System.out.println("Enter buyer's name: ");
        String buyerName = input.nextLine();
        invoice.setCartOwner(buyerName);
        String response = "yes";
        while(response.equals("yes")) {
            System.out.println("What did " + buyerName + " buy: ");
            String productName = input.next();
            item.itemName(productName);
            System.out.println("What is the quantity of " + productName + " bought: ");
            int quantity = input.nextInt();
            item.quantityOfItem(quantity);
            System.out.println("Enter price per " + productName);
            double price = input.nextDouble();
            item.price(price);
            item.setTotalPrice();
            double totalPrice = item.getTotalPrice();
            subTotal += totalPrice;
            invoice.setItems(productName, quantity, price, totalPrice);
            System.out.println("Anything else");
            response = input.next();
        }
        double valueAddedTax = 7.50/100 * subTotal;
        double billTotal = subTotal + valueAddedTax;
        System.out.println("Amount received from "+ buyerName + ": ");
        double amountPaid = input.nextDouble();
        double balance;
        if(amountPaid > billTotal){
            balance = amountPaid - billTotal;
        }
        else {
            balance = 0;
        }
        String storeDetails = """
                TOSKA E-STORE
                MAIN BRANCH
                ADDRESS: 312, HERBERT MACAULAY STREET, YABA
                TEL: +2348135410100
                """;
        System.out.printf("%n%s%nDATE: %s%nCASHIER: %s%n", storeDetails, timestamp, cashierName);
        System.out.println("=".repeat(40));
        System.out.printf("%5s%13s%5s%s%7s%n", "ITEM", "QTY","","PRICE", "#");
        System.out.println("-".repeat(40));
        System.out.println(invoice);
        System.out.println("-".repeat(40));
        System.out.printf("%15s%s%5s%.2f%n", "","Sub Total:","",(double)subTotal);
        System.out.printf("%15s%s%5s%3.2f%n", "","VAT @ 7.50%:","",valueAddedTax);
        System.out.println("=".repeat(40));
        System.out.printf("%15s%s%5s%.2f%n", "", "Bill Total:", "", billTotal);
        System.out.printf("%15s%s%5s%.2f%n", "", "Tendered:", "", amountPaid);
        System.out.printf("%15s%s%5s%.2f%n", "", "Balance:", "", balance);
        System.out.println("=".repeat(40));
        System.out.printf("%5s%s%n","","THANK YOU FOR YOUR PATRONAGE");
        System.out.println("=".repeat(40));

    }
}
