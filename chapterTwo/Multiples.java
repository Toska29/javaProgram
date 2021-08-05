//Exercise 2.26
import java.util.Scanner;
public class Multiples {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter first number: ");
	int firstNumber = input.nextInt();
	System.out.println("Enter second number: ");
	int secondNumber = input.nextInt();
	int multiple = secondNumber % firstNumber;
		if (multiple == 0){
		System.out.printf("%d is a multiple of %d", firstNumber, secondNumber);
		}
		if (multiple != 0){
		System.out.printf("%d is not a multiple of %d", firstNumber, secondNumber);
		}
	

}

}