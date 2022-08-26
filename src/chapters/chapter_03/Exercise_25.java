package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("nEnter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1, x2, x3, x4, y1, y2, y3, y4;

		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		x3 = in.nextDouble();
		y3 = in.nextDouble();
		x4 = in.nextDouble();
		y4 = in.nextDouble();

		double a, b, c, d;
		
		a = (y1 - y2);
		b = -(x1 - x2);
		c = (y3 - y4);
		d = -(x3 - x4)1;
		

		if ( < 0.000000001) {
			System.out.println("The equation has no solution because the lines are parallel.");

		} else {

			

			System.out.println("The intersecting point is at (" + x + "," + y + ")");
		}

	
	}

}
