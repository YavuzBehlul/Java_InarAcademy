package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {

		final int minute = 60;
		final int hour = 24;
		final int day = 365;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minute: ");

		int numberMins = input.nextInt();
		int numberYears = numberMins / minute / hour / day;
		int numberDays = numberMins / minute / hour % day;

		System.out.println(
				numberMins + " minutes is approximately " + numberYears + " years and " + numberDays + " days.");

		input.close();

	}

}
