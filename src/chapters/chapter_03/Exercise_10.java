package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_10 {

	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);

		System.out.print("What is " + num1 + " + " + num2 + " ? ");

		Scanner input = new Scanner(System.in);
		int userAnswer = input.nextInt();

		if (num1 + num2 == userAnswer)
			System.out.println("Your answer is correct!!!");
		else {
			System.out.println("Your answer is wrong!!!");
			System.out.println(num1 + " + " + num2 + " should be " + (num1 + num2));
			input.close();

		}

	}
}
