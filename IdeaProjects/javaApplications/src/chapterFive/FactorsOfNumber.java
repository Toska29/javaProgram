package chapterFive;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int factor = 1;

        System.out.println("Enter a number:");
        int digit = input.nextInt();

        while(factor <= digit){
            int divisor = digit % factor;
            if (divisor == 0){

                System.out.printf("%d ", factor);
            }
            factor++;
        }
    }
}
