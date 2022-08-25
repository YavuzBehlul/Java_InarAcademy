package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_17 {

	public static void main(String[] args) {

		int computer = (int) (Math.random() * 3);

		Scanner input = new Scanner(System.in);

		System.out.println("Scissor (0), rock (1), paper (2): ");

		int user = input.nextInt();

		if (user == 0 || user == 1 || user == 2) {
			switch (user) {
			case 0:
				if (computer == 0) {
					System.out.println("The computer is scissor and you are scissor, it's a draw.");
				} else if (computer == 1) {
					System.out.println("The computer is rock and you are scissor, you lost.");
				} else {
					System.out.println("The compuer is paper and you are scissor, you won.");
				}
				break;
			case 1:
				if (computer == 0) {
					System.out.println("The computer is scissor and you are rock, you won.");
				} else if (computer == 1) {
					System.out.println("The computer is rock and you are rock, its a draw.");
				} else {
					System.out.println("The compuer is paper and you are rock, you lost.");
				}
				break;

			case 2:
				if (computer == 0) {
					System.out.println("The computer is scissor and you are paper, you lost.");
				} else if (computer == 1) {
					System.out.println("The computer is rock and you are paper, you won.");
				} else {
					System.out.println("The compuer is paper and you are paper, its a draw.");
				}
				break;

			}

		}
		input.close();

	}

}
