package algorithms;

public class PerfectSquare {

    public static int numberOfPerfectSquare(int length, int width) {
        int number = 0;
        for (int i = length; i > 0; i--) {
            number = number + (i * width);
            width--;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(numberOfPerfectSquare(3,3));
    }
}

