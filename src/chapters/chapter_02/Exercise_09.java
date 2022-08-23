package chapters.chapter_02;

import java.util.Scanner;;

public class Exercise_09 {

	public static void main(String[] args) {
		double v0;
		double v1;
		double t;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter v0, v1, and t: ");

		v0 = input.nextDouble();
		v1 = input.nextDouble();
		t = input.nextDouble();

		double a = (v1 - v0) / t;

		System.out.println("The average acceleration is " + a);

		input.close();

	}

}
