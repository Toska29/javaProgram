package chapterFour;

import java.util.Scanner;

public class DecimalEquivalent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int divisorCounter = 0;
        int counter = 0;
        int number = 0;
        int decimal = 0;
        double num = 0;
        double count = 0;

        System.out.println("Enter binary numbers: ");
        int digit = input.nextInt();
        number = digit;

        while(digit != 0){
            digit = digit / 10;
            counter++;
        }
        while (divisorCounter <= counter){
            decimal = number % 10;
            number = number / 10;
            double power = Math.pow(2,count);

            num = num + (decimal * power);
            Math.pow(2,count++);

            divisorCounter++;

        }
        System.out.println(num);
    }

}
