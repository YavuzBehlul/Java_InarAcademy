package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2012): ");
		int year = input.nextInt();

		System.out.print("\nEnter month: 1-12: ");
		int month = input.nextInt();

		int m;
		if (month == 1) {
			m = 13;
			year -= 1;
		} else if (month == 2) {
			m = 14;
			year -= 1;
		} else {
			m = month;
		}

		int k = year % 100;
		int j = year / 100;

		System.out.print("\nEnter the day of the month: 1-31:");
		int q = input.nextInt();
		int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

		String dayWeek = "";

		switch (h) {
		case 0:
			dayWeek += "Saturday.";
			break;
		case 1:
			dayWeek += "Sunday.";
			break;
		case 2:
			dayWeek += "Monday.";
			break;
		case 3:
			dayWeek += "Tuesday.";
			break;

		case 4:
			dayWeek += "Wednesda.y";
			break;

		case 5:
			dayWeek += "Thursday.";
			break;

		case 6:
			dayWeek += "Friday.";
			break;
		}
		System.out.print("\nDay of the week is " + dayWeek);

		input.close();
	}

}
