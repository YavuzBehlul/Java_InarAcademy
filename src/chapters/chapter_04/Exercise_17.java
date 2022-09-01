package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		System.out.print("Enter a year: ");
//		int year = input.nextInt();

		System.out.println("Enter the month: ");
		String monthStr = input.nextLine();
		
		int monthInt = 0;
		
		if("Jan".equalsIgnoreCase(monthStr)) {
			monthInt += 1;
		}else if("Feb".equalsIgnoreCase(monthStr)){
			monthInt += 2;
		}else if("Mar".equalsIgnoreCase(monthStr)){
			monthInt += 3;
		}else if("Apr".equalsIgnoreCase(monthStr)){
			monthInt += 4;
		}else if("May".equalsIgnoreCase(monthStr)){
			monthInt += 5;
		}else if("Jun".equalsIgnoreCase(monthStr)){
			monthInt += 6;
		}else if("Jul".equalsIgnoreCase(monthStr)){
			monthInt += 7;
		}else if("Aug".equalsIgnoreCase(monthStr)){
			monthInt += 8;
		}else if("Sep".equalsIgnoreCase(monthStr)){
			monthInt += 9;
		}else if("Oct".equalsIgnoreCase(monthStr)){
			monthInt += 10;
		}else if("Nov".equalsIgnoreCase(monthStr)){
			monthInt += 11;
		}else if("Dec".equalsIgnoreCase(monthStr)){
			monthInt += 12;
		}else {
			System.out.println("Invalid month.");
		}

		String days = "";

		switch (monthInt) {
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
