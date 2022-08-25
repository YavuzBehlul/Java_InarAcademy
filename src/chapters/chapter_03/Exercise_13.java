package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("(0-single filer, 1-married jointly or " +
				"qualifying widow(er), 2-married separately, 3-head of " 
				+ "household) Enter the filing status: ");
		
		int status = input.nextInt();
		
		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();
		
		double tax = 0; 
		
		int taxRate10 = 0, taxRate15 = 0, taxRate25 = 0, taxRate28 = 0, taxRate33 = 0;
		
		if (status == 0) {
			taxRate10 = 8350;
			taxRate15 = 33950;
			taxRate25 = 82250;
			taxRate28 = 171550;
			taxRate33 = 372950;

		} else if (status == 1) { 
			taxRate10 = 16700;
			taxRate15 = 67900;
			taxRate25 = 137050;
			taxRate28 = 208850;
			taxRate33 = 372950;

		} else if (status == 2) { 
			taxRate10 = 8350;
			taxRate15 = 33950;
			taxRate25 = 68525;
			taxRate28 = 104425;
			taxRate33 = 186475;
			
		} else if (status == 3) { 
			taxRate10 = 11950;
			taxRate15 = 45500;
			taxRate25 = 117450;
			taxRate28 = 190200;
			taxRate33 = 372950;
		} else {
			System.out.println("Error: invalid status");
			System.exit(1);
		}

		if (income <= taxRate10)
			tax = income * 0.10;
		else if (income <= taxRate15)
			tax = taxRate10 * 0.10 + (income - taxRate10) * 0.15;
		else if (income <= taxRate25)
			tax = taxRate10 * 0.10 + (taxRate15 - taxRate10) * 0.15 + (income - taxRate25) * 0.25;
		else if (income <= taxRate28)
			tax = taxRate10 * 0.10 + (taxRate15 - taxRate10) * 0.15 + (taxRate25 - taxRate15) * 0.25
					+ (income - taxRate25) * 0.28;
		else if (income <= taxRate33)
			tax = taxRate10 * 0.10 + (taxRate15 - taxRate10) * 0.15 + (taxRate25 - taxRate15) * 0.25
					+ (taxRate28 - taxRate25) * 0.28 + (income - taxRate28) * 0.33;
		else
			tax = taxRate10 * 0.10 + (taxRate15 - taxRate10) * 0.15 + (taxRate25 - taxRate15) * 0.25
					+ (taxRate28 - taxRate25) * 0.28 + (taxRate33 - taxRate28) * 0.33 + (income - taxRate33) * 0.35;

		input.close();

		System.out.println("Tax is " + (int) (tax * 100) / 100.0);

	}

}
