package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {

		final int NUMBER_OF_QUESTIONS = 10;

		Scanner input = new Scanner(System.in);

		long timeOfStart = System.currentTimeMillis();

		String report = "";
		int counter = 0;
		int counterOfTrue = 0;

		while (counter < NUMBER_OF_QUESTIONS) {
			int number1 = (int) (1 + Math.random() * 15);
			int number2 = (int) (1 + Math.random() * 15);

			System.out.println(number1 + " + " + number2 + " =?");
			int answer = input.nextInt();

			report += number1 + " + " + number2 + " = " + answer;

			if (number1 + number2 == answer) {
				System.out.println("The answer is correct.");
				counterOfTrue++;
				report += " correct\n";
			} else {
				System.out.println("The answer is wrong.");
				report += " wrong\n";
			}
			counter++;
		}

		long timeOfFinish = System.currentTimeMillis();
		int span = (int) ((timeOfFinish - timeOfStart) / 1000);

		System.out.println("Total time: " + span + " second.");
		System.out.println(counter + " questions were asked.");
		System.out.println(counterOfTrue + " correct answer was given.");
		System.out.println(report);

		input.close();

	}

}
