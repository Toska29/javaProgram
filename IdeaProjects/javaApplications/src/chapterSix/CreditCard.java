package chapterSix;

import java.util.ArrayList;

public class CreditCard {
    private static long ccNumber;
    private static ArrayList<Integer> cardNumbers = new ArrayList<>();
    private static ArrayList<Integer> doubledEvenNumbers = new ArrayList<>();
    private static ArrayList<Integer> oddNumbers = new ArrayList<>();
    private static int addedOddNumbers;
    private static int addedDoubledEvenNumbers;
    private static int remainder;
    private static boolean valid;

    public static boolean isValid(long ccNumber){
        addDoubledEvenNumbers(ccNumber);
        setOddNumbers();
        addOddNumbers();
        setRemainder();
        if (remainder != 0){
             valid = false;
        }
        else {
            valid = true;
        }
        boolean valid = hasValid();
        return valid;
    }

    public static void setCardNumbers(long ccNumber){
        String number = Long.toString(ccNumber);
        for(int i = 0; i < number.length(); i++){
            cardNumbers.add(number.charAt(i) - '0');
        }
    }

    public static void setDoubledEvenNumbers(){
        for (int i = cardNumbers.size() - 2; i >= 0; i -= 2) {
            int evenNumber = cardNumbers.get(i);
            int doubledNumber = evenNumber * 2;
            if( doubledNumber >= 10){
                int newDoubledNumber = doubledNumber;
                int newNumber = 0;
                while (newDoubledNumber > 0){
                    newNumber = newNumber + (newDoubledNumber % 10);
                    newDoubledNumber /= 10;
                }
                doubledEvenNumbers.add(newNumber);
            }
            else {
                doubledEvenNumbers.add(doubledNumber);
            }
        }
    }

    public static void setOddNumbers(){
        for (int i = cardNumbers.size() - 1; i >= 0; i -= 2) {
            oddNumbers.add(cardNumbers.get(i));
        }
    }

    public static int addOddNumbers(long ccNumber){
        setCardNumbers(ccNumber);
        setOddNumbers();
        for (int i = 0; i < oddNumbers.size(); i++){
            addedOddNumbers += oddNumbers.get(i);
        }
        return addedOddNumbers;
    }

    public static void addOddNumbers(){
        for (int i = 0; i < oddNumbers.size(); i++){
            addedOddNumbers += oddNumbers.get(i);
        }
    }

    public static int addDoubledEvenNumbers(long ccNumber){
        setCardNumbers(ccNumber);
        setDoubledEvenNumbers();
        for(int i = 0; i < doubledEvenNumbers.size(); i++){
            addedDoubledEvenNumbers += doubledEvenNumbers.get(i);
        }
        return addedDoubledEvenNumbers;
    }

    public static int getAddedOddNumbers(){
        return addedOddNumbers;
    }
    public static int getAddedDoubledEvenNumbers(){
        return addedDoubledEvenNumbers;
    }
    public static void setRemainder(){
        int total = addedDoubledEvenNumbers + addedOddNumbers;
         remainder = total % 10;
    }

    public static boolean hasValid(){
        return valid;
    }
}
