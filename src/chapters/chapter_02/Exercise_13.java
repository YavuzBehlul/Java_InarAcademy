package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter  monthly saving : ");
		double monthSaving = input.nextDouble();
		double interestPerMonth = (1 + 0.05 / 12);

		double firstM = monthSaving * interestPerMonth;
		double secondM = (monthSaving + firstM) * interestPerMonth;
		double thirtM = (monthSaving + secondM) * interestPerMonth;
		double fourthM = (monthSaving + thirtM) * interestPerMonth;
		double fifthM = (monthSaving + fourthM) * interestPerMonth;
		double sixthM = (monthSaving + fifthM) * interestPerMonth;

		System.out.println("After the sixth month, the account value is " + sixthM);

		input.close();

	}

}
