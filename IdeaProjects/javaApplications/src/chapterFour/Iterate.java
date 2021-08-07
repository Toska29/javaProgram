package chapterFour;
import java.util.Scanner;
public class Iterate {
    public static void main(String[] args){

        int total = 0;
        int numberOfStudent = 0;

        Scanner input = new Scanner(System.in);

        for(int count =1; count<=10; count++){
            System.out.print("Enter score "+ count + ": ");
            int score = input.nextInt();

            total = total + score;
            numberOfStudent = numberOfStudent + 1;
        }

        double average = (double)total / numberOfStudent;
        System.out.println("Total score is: "+ total);
        System.out.println("number of students: "+ numberOfStudent);
        System.out.printf("Average is %.1f", average);
    }
}
