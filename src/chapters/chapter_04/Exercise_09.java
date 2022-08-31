package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_09 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a character: ");

		String string = input.next();
		char ch_0 = string.charAt(0);

		System.out.println("The Unicode for the character " + ch_0 + " is " + (int) ch_0);
		
		input.close();
	}
}