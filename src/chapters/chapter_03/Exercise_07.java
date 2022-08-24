package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();

		int remainingAmount = (int) (amount * 100);

		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount %= 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;

		int numberOfNickles = remainingAmount / 5;
		remainingAmount %= 5;

		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount + " consists of: ");

		if (numberOfOneDollars == 1) {
			System.out.println("1 dolar.");
		}

		else if (numberOfOneDollars > 1) {
			System.out.println(numberOfOneDollars + " dolars");
		} else {

		}
		if (numberOfQuarters == 1) {
			System.out.println("1 quarter.");
		}

		else if (numberOfQuarters > 1) {
			System.out.println(numberOfQuarters + " quarters.");
		} else {

		}

		if (numberOfDimes == 1) {
			System.out.println("1 dime.");
		}

		else if (numberOfDimes > 1) {
			System.out.println(numberOfDimes + " dimes.");
		} else {

		}
		if (numberOfNickles == 1) {
			System.out.println("1 nikle.");
		}

		else if (numberOfNickles > 1) {
			System.out.println(numberOfNickles + " nikles");
		} else {

		}
		if (numberOfPennies == 1) {
			System.out.println("1 penny.");
		}

		else if (numberOfPennies > 1) {
			System.out.println(numberOfPennies + " pennies.");
		} else {

		}
		input.close();

	}

}
