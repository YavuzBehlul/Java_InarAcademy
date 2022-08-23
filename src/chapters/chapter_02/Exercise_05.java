package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your subtotal and the gratuity rate: ");

		double subtotal = input.nextDouble();
		double percentGratuity = input.nextDouble();

		double gratuity = subtotal * (percentGratuity / 100);

		double total = subtotal + gratuity;

		System.out.print("The gratuity is: $" + gratuity);

		System.out.print(" and the total including gratuity is: $" + total);

		input.close();

	}

}
