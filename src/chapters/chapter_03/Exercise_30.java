package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_30 {

	public static void main(String[] args) {

		System.out.println("Enter the time zone offset to GMT : ");

		Scanner input = new Scanner(System.in);
		int gmt = input.nextInt();

		long totalMilSec = System.currentTimeMillis();

		long totalSec = totalMilSec / 1000;
		long totalMin = totalSec / 60;
		long totalHour = totalMin / 60;

		long currentSec = totalSec % 60;
		long currentMin = totalMin % 60;
		long currentHour = totalHour % 24;

		input.close();

		currentHour += gmt;

		if (currentHour > 12) {
			currentHour -= 12;
			System.out.println("Your current time is " + currentHour + " : " + currentMin + " : " + currentSec + "PM.");
		} else {

			System.out.println("Your current time is " + currentHour + " : " + currentMin + " : " + currentSec + "AM.");

		}
	}

}
