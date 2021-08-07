package chapterFive;

public class ChristmasSong {
    public static void main(String[] args) {
        int numberOfDays = 1;
        String song = "";
        String lyric = "";
        String lyrics = "" + lyric;
        while (numberOfDays <= 12){
            switch(numberOfDays){
                case 12:
                    song = "On the twelveth day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 11:
                    song = "On the eleventh day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 10:
                    song = "On the tenth day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 9:
                    song = "On the ninth day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 8:
                    song = "On the eighth day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 7:
                    song = "On the seventh day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 6:
                    song = "On the sixth day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 5:
                    song = "On the fifth day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 4:
                    song = "On the fourth day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 3:
                    song = "On the third day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 2:
                    song = "On the second day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
                case 1:
                    song = "On the first day of Christmas my true love sent to me \n";
                    System.out.println(song);break;
            }

            switch (numberOfDays) {
                case 12:
                    System.out.println("twelve drummers drumming");
                case 11:
                    System.out.println("eleven pipers piping ");
                case 10:
                    System.out.println("ten lords a-leaping");
                case 9:
                    System.out.println("nine ladies dancing");
                case 8:
                    System.out.println("eight maids a-milking");

                case 7:
                    System.out.println("seven swans a-swimming");
                case 6:
                    System.out.println("six geese a-laying");
                case 5:
                    System.out.println("five gold rings");
                case 4:
                    System.out.println("four calling birds");
                case 3:
                    System.out.println("Three French hens");
                case 2:
                    System.out.println("Two turtle doves and");
                case 1:
                    System.out.println("A partridge in a pear tree.\n");

           }
            numberOfDays++;
        }


    }
}
