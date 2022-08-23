package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter the radius of a cylinder :");
		
		double radius = input.nextDouble();
		double area = radius * radius *Math.PI;
		
		System.out.println("Area is  " + area );
		
		
		System.out.println("Enter the length of a cylinder :");
		
		double length = input.nextDouble();
		double volume = area * length ;
		
		System.out.println("Volume is  " + volume);
		
		input.close();
	}

}
