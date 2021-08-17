package chapterFive;

public class DiamondShape {
    public static void main(String[] args) {
        int row = 1;
        int row2 = 1;
        for(row = 1; row<=5; row++ ){
            for(int space1 = 5; space1 > row; space1-- ){
                System.out.print(" ");
            }
            for(int column1 = 1; column1<=row; column1++){
                System.out.print("*");
            }
            for (int column2 = 1; column2 < row; column2++){
                System.out.print("*");

            }
            System.out.println();
        }
        for(row2 = 1; row2 <=5; row2++){
            for(int space2 = 1; space2 < row2; space2++ ){
                System.out.print(" ");
            }
            for(int column3 = 5; column3 >= row2; column3--){
                System.out.print("*");
            }
            for(int column4 = 5; column4 > row2; column4--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
