//Exercise 2.17
import java.util.Scanner;
public class ArithComp {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter value for a, b and c: ");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	int sum = a + b + c;
	int product = a * b * c;
	int average = (a + b + c)/3;
		System.out.printf("The sum is %d%n", sum);
		System.out.printf("The product is %d%n", product);
		System.out.printf("The average is %d%n", average);
		if (a > b && a > c) {
		System.out.printf("%d is the largest %n", a);
		}
		if (b > a && b > c) {
		System.out.printf("%d is the largest%n", b);
		}
		if (c > a && c > b) {
		System.out.printf("%d is the largest%n", c);
		}
		if (a < b && a < c) {
		System.out.printf("%d is the smallest%n", a);
		}
		if (b < a && b < c) {
		System.out.printf("%d is the smallest%n", b);
		}
		if (c < b && c < a) {
		System.out.printf("%d is the smallest%n", c);
		}
}

}