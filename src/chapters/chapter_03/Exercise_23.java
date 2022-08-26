package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a point with two coordinates: ");

		double x1 = in.nextInt();
		double y1 = in.nextInt();

//		rectangle side of x = 10
//		rectangle side of y = 5
		
		String result = "";
		if (x1 <= 10.0 / 2 && y1 <= 5.0 / 2) {
			result += "is in the rectangle";
		} else {
			result += "is not in the rectangle.";
		}

		System.out.println("Point (" + x1 + " , " + y1 + ") " + result);

		in.close();
	}

}
