//Exercise 2.16
import java.util.Scanner;
public class Comparison {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter value a and b ");
	int a = input.nextInt();
	System.out.println("");
	int b = input.nextInt();
		if (a > b) {
		System.out.printf("%d is larger", a);
		}
		if (b > a) {
		System.out.printf("%d is larger", b);
		}
		if (a == b) {
		System.out.printf("These numbers are equal");
		}
}

}