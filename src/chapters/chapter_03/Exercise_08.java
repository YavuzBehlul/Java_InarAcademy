package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_08 {

	public static void main(String[] args) {
		System.out.println("Enter a three numbers:");
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();

		if (x > y) {
			int a = x;
			x = y;
			y = a;

		}

		if (y > z) {
			int b = y;
			y = z;
			z = b;
		}

		if (x > y) {
			int c = x;
			x = y;
			y = c;
		}
		System.out.println(x + "" + y + "" + z);
		input.close();
		
	}

}
