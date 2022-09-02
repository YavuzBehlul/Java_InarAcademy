package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point's x- and y- coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double x1 = 0, y1 = 0, x2 = 200, y3 = 100;

		if (x < x1 || y < y1) {
			System.out.println("The point is not in the triangle");
		} else if (x > x2 || y > y3) {
			System.out.println("The point is not in the triangle");
		} else if ((x * 1) + (y * 2) > x2) {
			System.out.println("The point is not in the triangle");
		} else {
			System.out.println("The point is in the triangle");
		}

		input.close();

	}
}
