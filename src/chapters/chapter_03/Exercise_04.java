package chapters.chapter_03;

public class Exercise_04 {

	public static void main(String[] args) {
		System.out.println("Welcome to the random month showcase!!!");

		int digitMonth = (int) (1 + Math.random() * 12);

		String monthName = "";

		switch (digitMonth) {

		case 1:
			monthName = "January";
			break;

		case 2:
			monthName = "Feburary";
			break;

		case 3:
			monthName = "March";
			break;

		case 4:
			monthName = "April";
			break;

		case 5:
			monthName = "May";
			break;

		case 6:
			monthName = "June";
			break;

		case 7:
			monthName = "July";
			break;

		case 8:
			monthName = "August";
			break;

		case 9:
			monthName = "September";
			break;

		case 10:
			monthName = "October";
			break;

		case 11:
			monthName = "November";
			break;

		case 12:
			monthName = "December";
			break;
		}

		System.out.println("Our month in the showcase: " + monthName);
	}

}
