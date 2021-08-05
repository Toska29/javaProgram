//Exercise 2.15
import java.util.Scanner;
public class Arithmetic{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter value a and b ");
	int a = input.nextInt();
	System.out.println("");
	int b = input.nextInt();
	int sum = a + b;
	int product = a * b;
	int difference = a - b;
	int division = a / b;
	System.out.printf("The sum is %d%nThe product is %d%nThe difference is %d%nThe division is %d", sum, product, difference, division);
	

}

}