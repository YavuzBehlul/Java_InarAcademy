package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x1, y1, x2, y2, r1, r2;

		System.out.println("Enter circle1's center x-, y-coordinates, and radius: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		r1 = input.nextDouble();

		System.out.println("Enter circle2's center x-, y-coordinates, and radius: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		r2 = input.nextDouble();

		double distBetweenCenters = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		String result = "";

		if (distBetweenCenters <= Math.abs(r1 - r2)) {
			result += "is inside circle1.";

		} else if (distBetweenCenters <= r1 + r2) {
			result += "overlaps circle1.";

		} else {
			result += "does not overlap circle1";

		}
		System.out.println("Circle2 " + result);

		input.close();

	}

}
