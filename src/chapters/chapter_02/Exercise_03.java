package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a value for feet  : ");

		double numberFeet = input.nextDouble();
		double numberMeters = numberFeet * 0.305;

		System.out.println(numberFeet + " feet is equal to " + numberMeters + " meters.");

		input.close();
	}

}
