package chapterFive;

public class TrianglePatternThree {
    public static void main(String[] args) {
        int row = 1;
        for(row = 1; row <= 10; row++){
            for(int column1 = 1; column1<= row; column1++ ){
                System.out.print("*");
            }
            for(int space1 = 10; space1 > row; space1--){
                System.out.print(" ");
            }

            System.out.print("\t\t");

            for(int column2 = 10; row <= column2; column2--){
                System.out.print("*");
            }
            for (int space2 = 1; space2 < row; space2++){
                System.out.print(" ");
            }

            System.out.print("\t\t");

            for(int space3 = 1; space3 < row; space3++){
                System.out.print(" ");
            }
            for (int column3 = 10; column3 >= row; column3--){
                System.out.print("*");
            }

            System.out.print("\t\t");

           for (int space4 = 10; space4 > row; space4-- ){
               System.out.print(" ");
            }
           for (int column4 = 1; column4 <= row; column4++ ){
               System.out.print("*");
           }

            System.out.println("");
        }
    }
}

