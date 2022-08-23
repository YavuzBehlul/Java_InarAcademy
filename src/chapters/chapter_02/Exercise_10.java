package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
		double initialTemperature;
		double finalTemperature;
		double weightofwater;

		System.out.println("Enter the amount of the water in kilograms : ");
		Scanner input = new Scanner(System.in);

		weightofwater = input.nextDouble();

		System.out.println("Enter the initial temperature : ");

		initialTemperature = input.nextDouble();

		System.out.println("Enter the final temperature : ");

		finalTemperature = input.nextDouble();

		double result;

		result = weightofwater * (finalTemperature - initialTemperature) * 4184;

		System.out.println("The energy needed is " + result + " joules.");

		input.close();

	}

}
