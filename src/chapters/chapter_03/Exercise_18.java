package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your packages weight: ");

		double weight = input.nextDouble();
		String cost = "";

		if (weight > 20) {
			System.out.println("The package cannot be shipped.");
		
		} else if (weight > 0 && weight <= 1) {
			cost += 3.5;

		} else if (weight > 1 && weight <= 3) {
			cost += 5.5;

		} else if (weight > 3 && weight <= 10) {
			cost += 8.5;

		} else if (weight > 10 && weight <= 20) {
			cost += 10.5;

		}
		System.out.println("Your package weight:  " + weight + "\nYour cost of shipping will be:  " + cost +"$");
		input.close();

	}

}
