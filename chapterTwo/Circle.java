//Exercise 2.28
import java.util.Scanner;
public class Circle {
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the radius of a circle:");
	int radius = input.nextInt();
	double pi = Math.PI;
	int diameter = 2 * radius;
	double circumference = 2 * pi * radius;
	double area = pi * radius * radius;
	System.out.printf("diameter = %d%n", diameter);
	System.out.printf("circumference = %f%n", circumference);
	System.out.printf("area = %f%n", area);



}

}