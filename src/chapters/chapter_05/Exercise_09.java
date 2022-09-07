package chapters.chapter_05;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {

		double highScore = 0;
		double secondHigh = 0;

		String highName = "";
		String secondName = "";
		String tempName = "";
		double tempScore = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of students: ");

		int numberStudents = input.nextInt();

		System.out.print("Enter a students name: ");
		highName = input.next();

		System.out.print("Enter the students score: ");
		highScore = input.nextDouble();

		while (numberStudents > 1) {

			System.out.print("Enter a students name: ");
			tempName = input.next();

			System.out.print("Enter the students score: ");
			tempScore = input.nextDouble();

			if (tempScore > highScore) {
				secondHigh = highScore;
				secondName = highName;
				highScore = tempScore;
				highName = tempName;

				numberStudents--;
				continue;
			}

			if (tempScore < highScore && tempScore > secondHigh) {
				secondHigh = tempScore;
				secondName = tempName;
			}
			numberStudents--;

		}
		System.out.println("The top two students are: ");
		System.out.print(highName + "'s score of " + highScore + " and " 
							+ secondName + "'s score of " + secondHigh);
		input.close();

	}

}
