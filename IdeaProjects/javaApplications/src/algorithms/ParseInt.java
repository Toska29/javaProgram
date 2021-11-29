package algorithms;

public class ParseInt {
    public static int parseInt(String number) {
        int counter = number.length();
        int newNumber = 0;
        int value = 0;
//        version 1
//        for (int i = 0; i < number.length(); i++) {
//            counter -= 1;
//            for (int j = counter; j <= counter; j++) {
//                if (number.charAt(j) == '0') value = 0;
//                if (number.charAt(j) == '1') value = 1;
//                if (number.charAt(j) == '2') value = 2;
//                if (number.charAt(j) == '3') value = 3;
//                if (number.charAt(j) == '4') value = 4;
//                if (number.charAt(j) == '5') value = 5;
//                if (number.charAt(j) == '6') value = 6;
//                if (number.charAt(j) == '7') value = 7;
//                if (number.charAt(j) == '8') value = 8;
//                if (number.charAt(j) == '9') value = 9;
//                newNumber += value * ((int) Math.pow(10, i));
//            }
//        }
       // version 2
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '0') value = 0;
            if (number.charAt(i) == '1') value = 1;
            if (number.charAt(i) == '2') value = 2;
            if (number.charAt(i) == '3') value = 3;
            if (number.charAt(i) == '4') value = 4;
            if (number.charAt(i) == '5') value = 5;
            if (number.charAt(i) == '6') value = 6;
            if (number.charAt(i) == '7') value = 7;
            if (number.charAt(i) == '8') value = 8;
            if (number.charAt(i) == '9') value = 9;
            newNumber += value * ((int)Math.pow(10, (number.length() - 1) - i));
        }
        return newNumber;
    }

    public static void main(String[] args) {
           System.out.println(parseInt("1234"));
    }
}
