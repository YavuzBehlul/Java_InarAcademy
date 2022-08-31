package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the radius of the bounding circle: ");
		double radius = in.nextDouble();
		double angleDivideFive = Math.toRadians(360 / 5.0); 
		
		double p1 = angleDivideFive;
		double p2 = angleDivideFive * 2;
		double p3 = angleDivideFive * 3;
		double p4 = angleDivideFive * 4;
		double p5 = angleDivideFive * 5;

		System.out.printf("(%.4f, %.4f)\n", radius * Math.sin(p1), radius * Math.cos(p1));
		System.out.printf("(%.4f, %.4f)\n", radius * Math.sin(p2), radius * Math.cos(p2));
		System.out.printf("(%.4f, %.4f)\n", radius * Math.sin(p3), radius * Math.cos(p3));
		System.out.printf("(%.4f, %.4f)\n", radius * Math.sin(p4), radius * Math.cos(p4));
		System.out.printf("(%.4f, %.4f)\n", radius * Math.sin(p5), radius * Math.cos(p5));

		in.close();

	}

}
