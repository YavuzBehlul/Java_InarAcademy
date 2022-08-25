package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		System.out.println("Please enter a three-digit integer:");

		Scanner input = new Scanner(System.in);
		int digitThree = input.nextInt();

		int numLast = digitThree % 10;
		int numFirst = digitThree / 100;

		if (numLast == numFirst) {
			System.out.println(digitThree + " is a Palindrome!!!");
		} else
			System.out.println(digitThree + " is not a Palindrome!!!");

		input.close();

	}

}
