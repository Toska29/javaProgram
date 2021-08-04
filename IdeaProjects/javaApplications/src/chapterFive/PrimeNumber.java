package chapterFive;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factor = 2;
        int num = 0;
        System.out.println("Enter a number");
        int digit = input.nextInt();

        while (factor <= digit){
            if(digit % factor == 0) {
                num = num + factor;
            }
            factor++;
        }
        if (num == digit){
            System.out.println("The digit is a prime number");
        }
        else {
            System.out.println("The digit is not a prime number");
        }
    }
}
