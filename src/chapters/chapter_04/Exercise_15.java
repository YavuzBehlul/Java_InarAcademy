package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter: ");

		String letter = input.next().trim();
		letter = letter.toLowerCase();

		int number = 0;

		if ("abc".contains(letter)) {
			number = 1;

		} else if ("def".contains(letter)) {
			number = 2;

		} else if ("ghi".contains(letter)) {
			number = 3;

		} else if ("jkl".contains(letter)) {
			number = 4;

		} else if ("mno".contains(letter)) {
			number = 5;

		} else if ("pqr".contains(letter)) {
			number = 6;

		} else if ("stu".contains(letter)) {
			number = 7;

		} else if ("vwx".contains(letter)) {
			number = 8;

		} else if ("yz".contains(letter)) {
			number = 9;

		} else {
			System.out.println(letter + " is an invalid input.");
			System.exit(0);
		}

		System.out.println("The corresponding number is: " + number);
		input.close();
	}

}
