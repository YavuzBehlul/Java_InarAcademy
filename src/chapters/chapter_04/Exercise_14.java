package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_14 {

	public static void main(String[] args) {
		System.out.println("Enter your letter grade: ");

		Scanner input = new Scanner(System.in);
		String inputGrade = input.next();
		
		char letterGrade = inputGrade.charAt(0);
		char numberGrade = 0;
		
		if (letterGrade == 'A') {
			numberGrade = '4';
		} else if (letterGrade == 'B')
			numberGrade = '3';
		else if (letterGrade == 'C')
			numberGrade = '2';
		else if (letterGrade == 'D')
			numberGrade = '1';
		else if (letterGrade == 'F')
			numberGrade = '0';
		else
			System.out.println(letterGrade +" is an invalid grade.");

		if (numberGrade >= '1' && numberGrade <= '5') {
			System.out.println("The numeric value for grade " + letterGrade + " " + "is " + numberGrade);
		}
		input.close();
	}

}
