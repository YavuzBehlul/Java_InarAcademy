package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");
		double x1 = input.nextInt();
		double y1 = input.nextInt();

		input.close();

		double xZero = 0;
		double yZero = 0;

		double distance_Zero = Math.sqrt(Math.pow(x1 - xZero, 2) + Math.pow(y1 - yZero, 2));

		if (distance_Zero <= 10) {
			System.out.println("Point (" + x1 + "  "+ y1 + ")  is in the circle.");
		} else {
			System.out.println("Point (" + x1 + "  "+ y1 + ")  is not in the circle.");
		}

	}
}
