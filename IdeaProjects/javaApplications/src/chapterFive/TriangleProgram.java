package chapterFive;

public class TriangleProgram {
    public static void main(String[] args) {
        for (int countRow = 1; countRow <= 10; countRow++){
            for(int countColumn = 1; countColumn <= countRow; countColumn++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("");

        for (int countRow = 1; countRow <= 10; countRow++){
            for(int countColumn =10; countRow <= countColumn; countColumn--) {

                System.out.print("*");

            }
            System.out.println();
        }

    }
}
