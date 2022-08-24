package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {

		int currentPopulation = 312_032_486;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years : ");

		int numberOfYears = input.nextInt();

		double secondsInYear = 365 * 24 * 60 * 60;

		int birthsPerYear = (int) (secondsInYear / 7);
		int deathsPerYear = (int) (secondsInYear / 13);
		int immigrantsPerYear = (int) (secondsInYear / 45);

		int sumPopulation = currentPopulation + (numberOfYears * (birthsPerYear - deathsPerYear + immigrantsPerYear));

		System.out.println("The population in " + numberOfYears + " is " + sumPopulation);

		input.close();
	}

}