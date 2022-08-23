package chapters.chapter_02;

import java.util.Scanner;

// Formule of area: 1/2 |x1.y2+x2.y3+x3.y1−(y1.x2+y2.x3+y3.x1)|
//HELP ME!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Exercise_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter three points for a triangle: ");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double s1;
		double s2;
		double s3;

		double s = (s1 + s2 + s3) / 2;

		double area = Math.sqrt((s * (s - s1) * (s - s2) * (s - s3)));

		// double data = ((x1 * y1) + (x2 * y3) + (x3 * y1)) - ((y1 * x2 ) + (y2 * x3)
		// +(y3 * x1) );
		// double dataSquare = Math.pow(data, 2);
		// double dataPositive = Math.pow(dataSquare, 0.5);
		// double dataPositive = Math.sqrt(dataSquare);
		// double area = (1 / 2) * dataPositive;
		System.out.println("The area of the triangle is: " + area);

		input.close();

	}

}
