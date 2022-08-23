package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number in pounds : ");

		double numberPound = input.nextDouble();
		double numberKilo = numberPound * 0.454;

		System.out.println(numberPound + " pounds is equal to " + numberKilo + " kilograms");

		input.close();

	}

}
