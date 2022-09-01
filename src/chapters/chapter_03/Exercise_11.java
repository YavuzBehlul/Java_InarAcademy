package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the month as an number from 1 to 12: ");
		int month = input.nextInt();

		System.out.print("Enter the year: ");
		int year = input.nextInt();

		String days = "";

		switch (month) {
		case 1:
			days = "January had 31 days.";
			break;
		case 2:
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				days = "February had 29 days.";
			} else {
				days = "February had 28 days.";
			}
			break;
		case 3:
			days = "March had 31 days.";
			break;
		case 4:
			days = "April had 30 days.";
			break;
		case 5:
			days = "May had 31 days.";
			break;
		case 6:
			days = "June had 30 days.";
			break;
		case 7:
			days = "July had 31 days.";
			break;
		case 8:
			days = "August had 31 days.";
			break;
		case 9:
			days = "September had 30 days.";
			break;
		case 10:
			days = "October had 31 days.";
			break;
		case 11:
			days = "November had 30 days.";
			break;
		case 12:
			days = "December had 31 days.";
			break;
		}
		System.out.println(year + " " + days);
		input.close();
	}

}
