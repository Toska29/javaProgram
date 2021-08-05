//Exercise 2.30
import java.util.Scanner;
public class Separate{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a number that contains five digits:");
	int number = input.nextInt();
	int digit5 = number % 10;

	int number1 = number /10;
	int digit4 = number1 % 10;

	int number2 = number1/10;
	int digit3 = number2 % 10;

	int number3 = number2 / 10;
	int digit2 = number3 % 10;

	int number4 = number3/10;
	int digit1 = number4 % 10;

		System.out.printf("%d   %d   %d   %d   %d", digit1, digit2, digit3, digit4, digit5);
	


}


}