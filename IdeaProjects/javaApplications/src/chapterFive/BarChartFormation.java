package chapterFive;

import java.util.Scanner;

public class BarChartFormation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit = 0;
        int counter = 1;
        String bars = "";
        while (counter <= 5){
            System.out.println("Enter digit from 1 - 30: ");
            digit = input.nextInt();
            boolean number = digit >= 1 && digit <= 30;
            while(number == false){
                System.out.println("Enter valid digit from 1 - 30: ");
                digit = input.nextInt();
                number = digit >= 1 && digit <= 30;
            }
            for(int count = 1; count <= digit; count++){
                bars = bars + "*";
            }
            bars +="\n";
            counter++;
        }

        System.out.println(bars);

    }
}
