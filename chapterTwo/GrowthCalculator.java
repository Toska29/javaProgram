//Exercise 2.34
import java.util.Scanner;
public class GrowthCalculator{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	double populationGrowthRate = 0.011;
	double currentWorldPopulation = 10_422_333;

	System.out.println("Enter the number of years of estimation");
	int time = input.nextInt();

	currentWorldPopulation = currentWorldPopulation + (currentWorldPopulation * populationGrowthRate);
	double estimatedWorldPopulation = (double)time * currentWorldPopulation;

	System.out.printf("Estimated World Population after %d year(s) is: %.2f ", time, estimatedWorldPopulation);
	
}

}