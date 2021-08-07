package chapterFive;

public class TrianglePatternTwo {
    public static void main(String[] args) {
        int countRow = 1;


        for ( countRow = 1; countRow <= 10; countRow++) {
            for (int countColumn = 1; countColumn < countRow; countColumn++) {
                System.out.print(" ");
            }
            for ( int column = 10; column >= countRow; column--) {
                    System.out.print("*");

            }

            System.out.println();
        }
        System.out.println(" ");

        for ( countRow = 1; countRow <= 10; countRow++) {
            for (int countColumn = 10; countColumn > countRow; countColumn--) {
                System.out.print(" ");
            }
            for ( int column = 1; column <= countRow; column++) {
                System.out.print("*");

            }

            System.out.println();
        }

    }
}
