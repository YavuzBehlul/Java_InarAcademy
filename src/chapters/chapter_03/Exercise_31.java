package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();

		System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int choice = input.nextInt();

		double amount = 0;

		if (choice == 1) {
			System.out.println("Enter the RMB amount: ");
		} else {
			System.out.println("Enter the dollar amount: ");
		}

		amount = input.nextDouble();

		if (choice == 0) {
			double yuan = amount * rate;
			System.out.println("$" + amount + "  is " + yuan + " yuan");

		} else {
			double dollars = amount / rate;
			System.out.println(amount + "  yuan is  $" + dollars);

		}input.close();

	}

}
