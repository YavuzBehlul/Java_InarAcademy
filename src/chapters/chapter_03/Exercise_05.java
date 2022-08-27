package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter today's day: ");
		int weekDay = input.nextInt();

		System.out.println("Enter the number of days elapsed since today:");
		int elapsed = input.nextInt();
		int elapsedDay = (weekDay + elapsed) % 7;

		switch (weekDay) {
		case 0:
			System.out.print("Today is Sunday ");
			break;
		case 1:
			System.out.print("Today is Monday ");
			break;
		case 2:
			System.out.print("Today is Tuesday ");
			break;
		case 3:
			System.out.print("Today is Wednesday ");
			break;
		case 4:
			System.out.print("Today is Thurday ");
			break;
		case 5:
			System.out.print("Today is Friday ");
			break;
		case 6:
			System.out.print("Today is Saturday ");
			break;
		}

		switch (elapsedDay) {
		case 0:
			System.out.println("and the future day is Sunday. ");
			break;
		case 1:
			System.out.println("and the future day is Monday. ");
			break;
		case 2:
			System.out.println("and the future day is Tuesday. ");
			break;
		case 3:
			System.out.println("and the future day is Wednesday. ");
			break;
		case 4:
			System.out.println("and the future day is Thurday. ");
			break;
		case 5:
			System.out.println("and the future day is Friday. ");
			break;
		case 6:
			System.out.println("and the future day is Saturday. ");
			break;

		}
		input.close();

	}
}
