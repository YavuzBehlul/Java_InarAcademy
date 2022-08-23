package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_06 {

	public static void main(String[] args) {

		System.out.print("Enter a number between 0 and 1000 : ");

		Scanner input = new Scanner(System.in);

		int userNumber = input.nextInt();

		int firstDigit = userNumber % 10;
		int secondDigit = (userNumber / 10) % 10;
		int tirthDigit = userNumber / 100;

		int sumDigits = firstDigit + secondDigit + tirthDigit;
		System.out.println("The sum of the digits is : " + sumDigits);

		input.close();

	}

}
