package algorithms;

public class PerfectSquareDeterminant {
    public static boolean isSquare(int number){
        double squareNumber = Math.sqrt(number);
        if (number < 0) return false;
        if(squareNumber % 1 > 0) return false;

        return true;
    }
}
