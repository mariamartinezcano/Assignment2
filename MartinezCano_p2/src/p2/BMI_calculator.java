package p2;

import java.util.Scanner;

public class BMI_calculator {

	public static void main(String[] args) {
		double weight;
		double height;
		double bmi;
		int mode;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to the BMI calculator!");
		System.out.println("-----------------------------------------------");
		System.out.println("Please press 1 to calculate your BMI in the SI System (kg and meters). Please press 2 to calculate your BMI in the Imperial System (pounds and inches). ");
		
		mode = in.nextInt();
		
		if (mode == 1)
		{
			System.out.println("What is your weight in kilograms? ");
			weight = in.nextDouble();
			System.out.println("What is your height in meters? ");
			height = in.nextDouble();
			System.out.println("");
			
			bmi = weight / Math.pow(height, 2);
			System.out.println("+-------------------+");
			System.out.printf("| Your BMI is %.2f |\n", bmi);
			System.out.println("+-------------------+");
			System.out.println("");
		}
		
		if (mode == 2)
		{
			System.out.println("What is your weight in pounds? ");
			weight = in.nextDouble();
			System.out.println("What is your height in inches? ");
			height = in.nextDouble();
			System.out.println("");
			
			bmi = (703 * weight) / Math.pow(height, 2);
			System.out.println("+-------------------+");
			System.out.printf("| Your BMI is %.2f |\n", bmi);
			System.out.println("+-------------------+");
			System.out.println("");
		}
		
		
		System.out.println("BMI Categories:");
		System.out.println("-------------------------------");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = 30 or greater");
		
		in.close();
	}

}
