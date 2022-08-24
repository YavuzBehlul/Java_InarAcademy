package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears*12)

		System.out.print("Enter investment amount: ");
		double investmentAmount = in.nextDouble();

		System.out.print("Enter annual interest rate in percentage: ");
		double interestRate = in.nextDouble();

		System.out.print("Enter number of years: ");
		double years = in.nextInt();

		years *= 12;
		double monthInterestRate = interestRate / 1200;

		System.out.println("Accumulated Value is " + investmentAmount * Math.pow(monthInterestRate + 1, years));
		in.close();

	}

}
