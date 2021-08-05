//Exercise 2.33
import java.util.Scanner;
public class BodyMassIndex{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter weight in kilogram: ");
	double weightInKilograms = input.nextDouble();
	
	System.out.println("Enter height in meters: ");
	double heightInMeters = input.nextDouble();

	double bodyMassIndex = weightInKilograms / (heightInMeters * heightInMeters);

	System.out.println("BMI VALUES");	
	System.out.println("Underweight:  less than 18.5");
	System.out.println("Normal: between 18.5 and 24.9");
	System.out.println("Overweight:	between 25 and 29.9");
	System.out.println("Obese: 30 or greater");
	System.out.println("");
	System.out.println("");
	System.out.println("Your BMI is: " + bodyMassIndex);


}

}