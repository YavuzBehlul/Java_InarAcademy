package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter values for a, b, and c : ");

		double a, b, c;

		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		double discriminant = (b * b) - (4 * a * c);

		if (discriminant > 0) {
			double r1 = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
			double r2 = ((-1 * b) - Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.print("Two equation has two roots: " + r1 + ", " + r2);

		} else if (discriminant < 0) {
			System.out.println("The equation has no real roots because discriminant is negative.");

		} else {
			double r = ((-1 * b) + Math.pow(discriminant, 0.5)) / (2 * a);
			System.out.print("The equation one real root: " + r);

		}
		input.close();
	}

}
