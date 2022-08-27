package chapters.chapter_02;

import java.util.Scanner;

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

		double s1Po = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
		double s2Po = Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2);
		double s3Po = Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2);
		
		double s1 = Math.pow(s1Po, 0.5);
		double s2 = Math.pow(s2Po, 0.5);
		double s3 = Math.pow(s3Po, 0.5);
		
		double s = (s1 + s2 + s3) / 2;

		double area = Math.sqrt((s * (s - s1) * (s - s2) * (s - s3)));

		System.out.println("The area of the triangle is: " + area);

		input.close();

	}

}
