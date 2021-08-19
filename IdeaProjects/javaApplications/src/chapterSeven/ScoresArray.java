package chapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class ScoresArray {
    public static int maximumNumber(int[] array){
        int maximum = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > maximum)
            maximum = array[i];
        }
        return  maximum;
    }

    public static int minimumNumber(int[] array){
        int minimum = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < minimum)
                minimum = array[i];
        }
        return  minimum;
    }

    public static int totalNumberOf(int[] arrays){
        int total = 0;
        for(int array:arrays){
            total += array;
        }
        return total;
    }

    public static double averageOf(int[] arrays){
        double total = totalNumberOf(arrays);
        return total / (double) arrays.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents];

        for(int numberOfInput = 0; numberOfInput < scores.length; numberOfInput++){
            System.out.println("Enter score " + (numberOfInput + 1) + ":");
            scores[numberOfInput] = input.nextInt();
        }
        System.out.println(Arrays.toString(scores));

        System.out.println("The maximum number: " + maximumNumber(scores));
        System.out.println("The minimum number: " + minimumNumber(scores));
        System.out.println("The total number: " + totalNumberOf(scores));
        System.out.println("The average: " + averageOf(scores));

    }
}
