package chapterFive;

public class Tabulation {
    public static void main(String[] args) {
        int row = 1;
        int column1 = 0;
        String number = "N\t   10*N \t100*N \t1000*N";
        System.out.println(number);
        for( row = 1; row <= 5; row++){
            column1 = row;
            for(; column1 == row; column1++){
                int firstMultiple = (10 * column1);
                int secondMultiple = (100 * column1);
                int thirdMultiple = (1000 * column1);
                System.out.println(column1+ "\t\t" + firstMultiple + "\t\t"+  secondMultiple + "\t\t" + thirdMultiple);
            }
            System.out.println();
        }
    }
}
