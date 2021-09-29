package sevenSegmentDisplay;

import java.util.Arrays;

public class SevenSegment {
    private int[][] segment = new int[5][4];

    public void setUpSevenSegmentScreen(String userInput){
        for(int row = 0; row < userInput.length(); row++){
            switch (row){
                case 0:
                    int a = Character.getNumericValue(userInput.charAt(row));
                    if(a == 1){ setSevenSegmentScreenA(); }
                    break;
                case 1:
                    int b = Character.getNumericValue(userInput.charAt(row));
                    if(b == 1){ setSevenSegmentScreenB(); }
                    break;
                case 2:
                    int c = Character.getNumericValue(userInput.charAt(row));
                    if(c == 1){ setSevenSegmentScreenC(); }
                    break;
                case 3:
                    int d = Character.getNumericValue(userInput.charAt(row));
                    if(d == 1){ setSevenSegmentScreenD(); }
                    break;
                case 4:
                    int e = Character.getNumericValue(userInput.charAt(row));
                    if(e == 1){ setSevenSegmentScreenE(); }
                    break;
                case 5:
                    int f = Character.getNumericValue(userInput.charAt(row));
                    if(f == 1){ setSevenSegmentScreenF(); }
                    break;
                case 6:
                    int g = Character.getNumericValue(userInput.charAt(row));
                    if(g == 1){ setSevenSegmentScreenG(); }
                    break;
                case 7:
                    int h = Character.getNumericValue(userInput.charAt(row));
                    if(h == 0){ clearScreen(); }
                    break;
            }
        }
    }

    public static int[][] createSevenSegment(){
        int[][] theSegment = {{1,1,1,1}, {1,0,0,1}, {1,1,1,1}, {1,0,0,1}, {1,1,1,1}};
        return theSegment;
    }

    private void setSevenSegmentScreenA(){
        segment[0][0] = 1;
        segment[0][1] = 1;
        segment[0][2] = 1;
        segment[0][3] = 1;
    }
    private void setSevenSegmentScreenB(){
        segment[0][3] = 1;
        segment[1][3] = 1;
        segment[2][3] = 1;
    }
    private void setSevenSegmentScreenC(){
        segment[2][3] = 1;
        segment[3][3] = 1;
        segment[4][3] = 1;
    }
    private void setSevenSegmentScreenD(){
        segment[4][0] = 1;
        segment[4][1] = 1;
        segment[4][2] = 1;
        segment[4][3] = 1;
    }
    private void setSevenSegmentScreenE(){
        segment[2][0] = 1;
        segment[3][0] = 1;
        segment[4][0] = 1;
    }
    private void setSevenSegmentScreenF(){
        segment[0][0] = 1;
        segment[1][0] = 1;
        segment[2][0] = 1;
    }
    private void setSevenSegmentScreenG(){
        segment[2][0] = 1;
        segment[2][1] = 1;
        segment[2][2] = 1;
        segment[2][3] = 1;
    }
    public void clearScreen(){
        int[][] zeroArray = segment;
        for (int row = 0; row < zeroArray.length; row++) {
            for (int column = 0; column < zeroArray[0].length; column++) {
                zeroArray[row][column] = 0;
            }
        }
    }

    public void displaySevenSegment(){
        int[][] arrayToDisplay = segment;
        for (int row = 0; row < arrayToDisplay.length; row++) {
            for (int column = 0; column < arrayToDisplay[0].length; column++) {
                if (arrayToDisplay[row][column] == 1){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(segment);
    }
}
