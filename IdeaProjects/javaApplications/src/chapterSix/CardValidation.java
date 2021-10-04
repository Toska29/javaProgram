package chapterSix;

import java.util.Scanner;

public class CardValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a credit card number");
        long creditCard = input.nextLong();
        boolean validity = CreditCard.isValid(creditCard);
        if (validity == false){
            System.out.println(creditCard + " is invalid");
        }
        else{
            System.out.println(creditCard +" is valid");
        }
    }
}
