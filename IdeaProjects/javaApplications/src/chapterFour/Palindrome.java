package chapterFour;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        int firstNumber =  a + b + c;
        int secondNumber =  e + d + c;

        System.out.println("Enter a five digit number:");
        int digit = input.nextInt();
        int count = 0;
        number = digit;
        while (number!=0){
            number = number/10;

            count++;
        }
        if (count == 5){
            a = digit % 10;
            int num1 = digit/10;

            b = num1 % 10;
            int num2 = num1/10;

            c = num2 % 10;
            int num3 = num2/10;

            d = num3 % 10;
            int num4 = num3/10;

            e = num4 % 10;

            if (firstNumber == secondNumber){
                System.out.println("The number is a palindrome");

            }

            else{
                System.out.println("The number is not a palindrome");
            }


        }
        else {
            System.out.println("error! Please enter a five digit number");
        }


    }
}
