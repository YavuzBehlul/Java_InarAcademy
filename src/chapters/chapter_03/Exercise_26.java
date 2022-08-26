package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.println("Enter an integer: ");
        int userInt = input.nextInt();

        boolean and = userInt % 5 == 0 && userInt % 6 == 0;
        boolean or = userInt % 5 == 0 || userInt % 6 == 0;
        boolean notBoth = (userInt % 5 == 0 || userInt % 6 == 0) ^ (userInt % 5 == 0 && userInt % 6 == 0);

        System.out.println("Is " + userInt + " divisible by 5 and 6 ? " + and);
        System.out.println("Is " + userInt + " divisible by 5 or 6 ? " + or);
        System.out.println("Is " + userInt + " divisible by 5 or 6, but not both ? " + notBoth);
        
        input.close();
        



	}

}
