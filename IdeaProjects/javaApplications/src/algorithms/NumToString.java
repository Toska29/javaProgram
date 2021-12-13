package algorithms;


import java.util.*;

public class NumToString {
    private boolean heatWave = true;
    public static String numToString(int number){
        String stringNumber = Integer.toString(number);
        return stringNumber;
    }


    public static String longest(String s1, String s2){
        SortedSet<String> sortedString = new TreeSet<>();
        String s3 = s1 + s2;
        for (int i = 0; i < s3.length(); i++) {
            sortedString.add(Character.toString(s3.charAt(i)));
        }

        String[] array =  sortedString.toArray(new String[sortedString.size()]);
        String newString = "";
        for (int i = 0; i < array.length; i++) {
            newString = newString + array[i];
        }
        return newString;
    }

    public static int findEvenIndex(int[] arr) {
        int rightIndex = 0;
        int leftIndex = 0;
        int total = 0;
        int num = 0;
        int num1 = 0;
        Set<Integer> uniqueNumber = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            uniqueNumber.add(arr[i]);
        }
        Integer[] arrNumber = uniqueNumber.toArray(new Integer[uniqueNumber.size()]);
        for (int i = 0; i < arrNumber.length; i++) {
            total += arrNumber[i];
        }

        for (int i = 0; i < arr.length; i++) {
            num += arr[i];
            if(num == total || num > total) {
                rightIndex = i;
                break;
            }

        }

        for (int j = arr.length -1; j >= 0; j--){
            num1 += arr[j];
            if(num1 == total || num1 > total) {
                leftIndex = j;
                break;
            }

        }
        if(leftIndex == rightIndex){
            return leftIndex;
        }

        return -1;
    }

    public static void main(String[] args) {
//        String newString = longest("qwerty", "thyuji");
//        System.out.println(newString);
        int[] arrNumber = {20,10,30,10,10,15,35};
        int number = findEvenIndex(arrNumber);
        System.out.println(number);
        boolean heatWave = false;
        System.out.println(heatWave);
    }
}
