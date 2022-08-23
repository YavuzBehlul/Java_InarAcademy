package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your weight in pounds: ");
		double weightInpounds = input.nextDouble();

		System.out.print("Enter you height in inches: ");
		double heightInInches = input.nextDouble();

		double weightInkilograms = weightInpounds * 0.45359237;

		double heightInmeters = heightInInches * 0.0254;

		double metersPow = Math.pow(heightInmeters, 2);

		System.out.println("Your BMI is: " + (weightInkilograms / metersPow));

		input.close();

	}

}
