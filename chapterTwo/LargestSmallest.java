//Exercise 2.24
import java.util.Scanner;
public class LargestSmallest {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter value for a, b, c, d, e: ");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	int d = input.nextInt();
	int e = input.nextInt();
		if (a > b && a > c && a > d && a > e) {
		System.out.printf("%d is the largest %n", a);
		}
		if (b > a && b > c && b > d && b > e) {
		System.out.printf("%d is the largest%n", b);
		}
		if (c > a && c > b && c > d && c > e) {
		System.out.printf("%d is the largest%n", c);
		}
		if (d > a && d > b && d > c && d > e) {
		System.out.printf("%d is the largest%n", d);
		}
		if (e > a && e > b && e > c && e > d) {
		System.out.printf("%d is the largest%n", e);
		}
		if (a < b && a < c && a < d && a < e) {
		System.out.printf("%d is the smallest%n", a);
		}
		if (b < a && b < c && b < d && b < e) {
		System.out.printf("%d is the smallest%n", b);
		}
		if (c < b && c < a && c < d && c < e) {
		System.out.printf("%d is the smallest%n", c);
		}
		if (d < a && d < b && d < c && d < e) {
		System.out.printf("%d is the smallest%n", d);
		}
		if (e < a && e < b && e < c && e < d) {
		System.out.printf("%d is the smallest%n", e);
		}
}

}