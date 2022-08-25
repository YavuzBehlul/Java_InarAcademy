package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if (side3 > (side1 + side2) || side2 > (side1 + side3) || side1 > (side3 + side2)) {
			System.out.println("The input is invalid.");
		} else {
			System.out.println("Perimeter of triangle is " + (side1 + side2 + side3));
		}
		input.close();

	}

}
