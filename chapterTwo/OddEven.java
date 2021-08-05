//Exercise 2.25
import java.util.Scanner;
public class OddEven {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int number = input.nextInt();
	int even = number % 2;
		if (even == 0){
		System.out.printf("%d is Even number", number);
		}
		if (even != 0){
		System.out.printf("%d is Odd number", number);
		}
	

}

}