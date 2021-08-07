package chapterFour;

import java.util.Scanner;

public class Finance {

    public static void main(String[] args){

        double tuition = 10_000;
        double rate = 0.05;
        int time;
        double increaseTuition = tuition * rate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        time = input.nextInt();
        tuition = tuition + (increaseTuition * time);

        System.out.println(tuition);

        System.out.println(tuition = tuition + (increaseTuition * 4));

    }


}
