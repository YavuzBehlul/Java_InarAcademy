package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("Enter balance and interest rate: (e.g., 3 for 3%): ");

		double balance = input.nextDouble();
		double rate = input.nextDouble();
		double interest = balance * (rate / 1200);
		
		
		System.out.println("The interest rate is: " + interest);
		
		input.close();

	}

}
