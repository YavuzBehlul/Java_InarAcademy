package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 and y1: ");
		double x1, x2, y1, y2;

		x1 = input.nextDouble();
		y1 = input.nextDouble();

		System.out.println("Enter x2 and y2: ");

		x2 = input.nextDouble();
		y2 = input.nextDouble();

		double xPoint = Math.pow((x2 - x1), 2);
		double yPoint = Math.pow((y2 - y1), 2);

		double result = Math.pow((xPoint + yPoint), 0.5);

		System.out.println("The distance between the two points is " + result);
		input.close();

	}

}
