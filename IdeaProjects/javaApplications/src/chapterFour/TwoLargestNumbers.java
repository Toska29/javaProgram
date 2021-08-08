package exerciseFourSolutions;

import java.util.Scanner;

public class TwoLargestNumbers {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int largestNumber = Integer.MIN_VALUE;
        int runnerUpNumber = Integer.MIN_VALUE;
        int num = Integer.MIN_VALUE;
        int recentDigit= Integer.MIN_VALUE;
        int counter = 1;

        String number = "number " + counter;

        while(counter <= 10){

            System.out.println("Enter number "+ counter);
            int digit = input.nextInt();

            if(digit != num && digit != largestNumber && digit != recentDigit){
                recentDigit = digit;

                if(digit > largestNumber) {
                    num = largestNumber;
                    largestNumber = digit;
                    number = "number " + counter;
                    if (num > runnerUpNumber) {
                        runnerUpNumber = num;

                    }
                }
                else {
                    if(digit > num && digit > runnerUpNumber){
                        runnerUpNumber = digit;
                    }

                }

            }
            else {
                System.out.println("Enter non repetitive digit");
                int digit2 = input.nextInt();
                recentDigit = digit2;

                if(digit2 > largestNumber) {
                    num = largestNumber;
                    largestNumber = digit2;
                    number = "number " + counter;
                    if (num > runnerUpNumber) {
                        runnerUpNumber = num;

                    }
                }
                else {
                    if(digit2 > num && digit2 > runnerUpNumber){
                        runnerUpNumber = digit2;
                    }

                }
            }

            counter++;
        }

        System.out.println(number + ": "+  largestNumber +  " is the largest number");

        System.out.println("while "+ runnerUpNumber + " is the second large number");

}
}
