package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"Enter R1's center point x-,  y- coordinates, width and height:");

		double rec1x = input.nextDouble();

		double rec1y = input.nextDouble();

		double width1 = input.nextDouble();

		double height1 = input.nextDouble();

		System.out.println(
				"Enter R2's center point x-, y- coordinates, width and height:");

		double rec2x = input.nextDouble();

		double rec2y = input.nextDouble();

		double width2 = input.nextDouble();

		double height2 = input.nextDouble();

		double top1x = rec1x + width1 / 2;

		double top1y = rec1y + height1 / 2;

		double bottom1x = rec1x - width1 / 2;

		double bottom1y = rec1y - height1 / 2;

		double top2x = rec2x + width2 / 2;

		double top2y = rec2y + height2 / 2;

		double bottom2x = rec2x - width2 / 2;

		double bottom2y = rec2y - height2 / 2;

		if (((top1y > top2y && top2y > bottom1y) && (top1y > bottom2y && bottom2y > bottom1y))
				&& ((top1x > top2x && top2x > bottom1x) && (top1x > bottom2x && bottom2x > bottom1x))) {
			
			System.out.println("R2 is inside R1.");

		} else if (((top1y > top2y && top2y > bottom1y) || (top1y > bottom2y && bottom2y > bottom1y))
				&& ((top1x > top2x && top2x > bottom1x) || (top1x > bottom2x && bottom2x > bottom1x))) {
			
			System.out.println("R2 overlaps R1.");
			
		} else {
			
			System.out.println("R2 not overlaps R1.");
		}

		input.close();

	}

}
