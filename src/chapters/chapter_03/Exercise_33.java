package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight and price for package 1: ");
		double weightP1 = input.nextDouble();
		double pac1 = input.nextDouble();
		
		System.out.print("Enter weight and price for package 2: ");
		double weightP2 = input.nextDouble();
		double pac2 = input.nextDouble();
		
		String low = "";
		
		
		if (pac1 / weightP1 > pac2 / weightP2) {
				low += "Package 2";
				
				
				System.out.println(low + " has a better price.");
				
		} else if (pac1 / weightP1 < pac2 / weightP2) {
				low += "Pakage 1";
				
				
				System.out.println(low + " has a better price.");
				
		} else { System.out.println("Two packages have the same price.");
			 }
		
			input.close();
			
}

}
