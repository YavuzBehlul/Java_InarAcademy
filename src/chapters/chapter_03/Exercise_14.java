package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
		int x = (int) (Math.random() + 0.5);

		System.out.println("Enter your guess : (0 for heads, or 1 for tails)");

		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();

		if (guess == x) {
			System.out.println("Right guess!!!");
		} else {
			System.out.println("Sorry, wrong guess!!!");
			System.out.println("The result was: " + x);
		}
		input.close();

	}

}
