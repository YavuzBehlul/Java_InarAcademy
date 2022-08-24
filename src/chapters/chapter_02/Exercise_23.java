package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {

		double distance;
		double milesPerGallon;
		double pricePerGallon;

		System.out.println("Enter the driving distance :");

		Scanner input = new Scanner(System.in);
		distance = input.nextDouble();

		System.out.println("Enter miles per gallon: ");

		milesPerGallon = input.nextDouble();

		System.out.println("Enter price per gallon: ");

		pricePerGallon = input.nextDouble();

		double drivingCost = (distance / milesPerGallon) * pricePerGallon;

		System.out.println("The cost of driving is: $" + drivingCost);

		input.close();

	}

}
