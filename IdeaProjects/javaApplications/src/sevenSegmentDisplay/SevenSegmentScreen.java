package sevenSegmentDisplay;

import java.util.Scanner;

public class SevenSegmentScreen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SevenSegment segment = new SevenSegment();
        System.out.println("Enter 8 digits in base two for your Seven Segment Value: ");
        String userInput = input.nextLine();
        segment.setUpSevenSegmentScreen(userInput);
        //System.out.println(segment);
        segment.displaySevenSegment();
    }
}
