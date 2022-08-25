package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double temperature = input.nextDouble();

		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		int windSpeed = input.nextInt();

		if (temperature >= -58 && temperature <= 41 && windSpeed >= 2) {

			double vPower = Math.pow(windSpeed, 0.16);

			double twc = 35.74 + (0.6215 * temperature) - (35.75 * vPower) + (0.4275 * temperature * vPower);
			System.out.println("The wind chill index is " + twc);
		} else {
			System.out.println("You are not entering valid input.");
		}
		input.close();

	}

}
