package chapters.chapter_03;
// HELP ME !!!!!!!!!!!!!!!!!!
import java.util.Scanner;

public class Exercise_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point's x- and y- coordinates: ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double x1 = 0, y1 = 0, x2 = 200, y2 = 0, x3 = 0, y3 = 100;
		double Dx, Dy;

		double determinant = (y2 - y3) * (x1 - x3) - (x3 - x2) * (y3 - y1);

		Dx = x - x3;
		Dy = y - y3;

		String result = "";

		double a = (y2 - y3) * Dx + (x3 - x2) * Dy;

		if (a < determinant) {
			result += "The point is not in the triangle.";

		}
		double b = (y3 - y1) * Dx + (x1 - x3) * Dy;

		if (b < determinant) {
			result += "The point is not in the triangle.";

		} else {
			result += "The point is in the triangle.";
		}
		System.out.println(result);

		input.close();

	}
}
