package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter dollar amount as cents : ");
		int amount = input.nextInt();

		double quarters, dimes, nickles, pennies = 0;

		double cents = amount % 100;
		double dollars = amount / 100;

		quarters = cents / 25;

		dimes = cents / 10;

		nickles = cents / 5;

		pennies = cents / 1;

		System.out.println("Your amount as cents " + amount + " consists of " + "\n" + dollars + " dollars and " + "\n"
				+ quarters + " quarters or " + "\n" + dimes + " dimes or " + "\n" + nickles + " nickels or" + "\n" + pennies
				+ " pennies.");

		input.close();
	}

}
