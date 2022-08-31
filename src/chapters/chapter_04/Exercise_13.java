package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter: ");
		String str = input.next().trim();

		if (str.length() > 1) {
			System.out.println(str + " is invalid input.");

		} else {
			char ch = str.charAt(0);

			if (Character.isLetter(ch)) {

				String s = ch + "";
				String result = "";

				if ("aeiou".contains(s.toLowerCase())) {

					result += "vowel";

				} else {

					result += "consonant";
				}

				System.out.println(ch + " is a " + result);

			} else {
				System.out.println(ch + " is invalid input.");
			}
		}
		input.close();
	}

}
