package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		System.out.println("Enter the number of sides: ");

		Scanner input = new Scanner(System.in);

		int numberSides = input.nextInt();

		System.out.println("Enter the length of the sides: ");

		double lengthSides = input.nextDouble();

		double area = (numberSides * Math.pow(lengthSides, 2)) / (4 * Math.tan(Math.PI / numberSides));

		System.out.println("The area of your polygon is: " + area);
		input.close();

	}

}
