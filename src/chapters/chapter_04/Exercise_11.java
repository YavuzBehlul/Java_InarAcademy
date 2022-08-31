package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_11 {

	public static void main(String[] args) {
		
		System.out.println("Enter a value (0 to 15): ");

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        if (userInput > 15 || userInput < 0) {
            System.out.println("Invalid number.");
        }
        if (userInput >= 0 && userInput <= 9) {
            System.out.println("The hex value is " + userInput);
        }

        switch (userInput) {
            case 10:
                System.out.println("The hex value is " + "A");
                break;

            case 11:
                System.out.println("The hex value is " + "B");
                break;

            case 12:
                System.out.println("The hex value is " + "C");
                break;

            case 13:
                System.out.println("The hex value is " + "D");
                break;

            case 14:
                System.out.println("The hex value is " + "E");
                break;

            case 15:
                System.out.println("The hex value is " + "F");
                break;
        }
        input.close();


	}

}
