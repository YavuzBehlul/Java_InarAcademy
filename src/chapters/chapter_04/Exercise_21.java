package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a SSN: ");
		String ssn = input.nextLine().trim();

		if ('-' == ssn.charAt(3)) {
			if ('-' == ssn.charAt(6)) {
				System.out.println(ssn + " is a valid social security number. ");
			} else {
				System.out.println(ssn + " is an valid social security number. ");
			}

		} else {
			System.out.println(ssn + " is an valid social security number. ");
		}
		input.close();

	}

}
