package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for p0, p1, p2: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double determinant = ((x2 - x1) * (y3 - y1)) - ((y2 - y1) * (x3 - x1));

		String point = "(" + x3 + " , " + y3 + ") is ";
		String end = " from " + "(" + x1 + " , " + y1 + ") to " + "(" + x2 + " , " + y2 + ")";

		String detResult = "";

		if (determinant > 0 || determinant < 0) {
			detResult += "not on the line segment ";
		} else if (determinant == 0) {
			detResult += "on the line segment ";
					

		}

		System.out.println(point + detResult + end);
		input.close();

	}

}
