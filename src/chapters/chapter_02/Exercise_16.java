package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a length of the side of a hexagon: ");
		double side = input.nextDouble();

		double formuleOfArea = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);
		
		System.out.println("The area of the hexagon is " + formuleOfArea);

		input.close();

	}

}
