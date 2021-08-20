package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class AdditionOfScoresArray {
    public static int[] additionOfOtherIndex(int[] arrays){
        int[] newArrays = new int[arrays.length];
        int newValue = 0;
        for(int i = 0; i < arrays.length; i++) {
            newValue = ScoresArray.totalNumberOf(arrays) - arrays[i];
            newArrays[i] = newValue;
        }
        return newArrays;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];
        for(int i =0; i < scores.length; i++){
            System.out.println("Enter score " + (i + 1) + ":");
            int userInput = input.nextInt();
            scores[i] = userInput;
        }
        System.out.println(Arrays.toString(scores));
        int[] newArray = additionOfOtherIndex(scores);

        System.out.println(Arrays.toString(newArray));
        System.out.println("The maximum number: " + ScoresArray.maximumNumber(newArray));
        System.out.println("The minimum number: " + ScoresArray.minimumNumber(newArray));
    }
}
