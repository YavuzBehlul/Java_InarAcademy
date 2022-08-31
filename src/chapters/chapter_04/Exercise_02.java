package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {

		double x1, x2, y1, y2, distance;

	    double radius = 6371.01;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter point 1 (latitude and longitude) in degrees: ");

		x1 = input.nextDouble();
		y1 = input.nextDouble();

		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);

		System.out.println("Enter point 2 (latitude and longitude) in degrees: ");

		x2 = input.nextDouble();
		y2 = input.nextDouble();

		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		distance = radius
				* (Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2))));

		System.out.println("The distance between the two points is: " + distance + " km");
		input.close();

	}

}
