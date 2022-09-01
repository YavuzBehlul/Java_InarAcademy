package chapters.chapter_03;

import java.util.Scanner;

public class Exercise_09 {

	public static void main(String[] args) {
		System.out.print("Enter the first 9 digits of an ISBN integer: ");
		Scanner input = new Scanner(System.in);
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		int number4 = input.nextInt();
		int number5 = input.nextInt();
		int number6 = input.nextInt();
		int number7 = input.nextInt();
		int number8 = input.nextInt();
		int number9 = input.nextInt();
		
		int result = (number1*1 + number2*2 + number3*3 + number4*4 +
				number5*5 + number6*6 + number7*7 + number8*8 + number9*9)%11;
		
		
		if(result == 10) {
			System.out.println("The ISBN-10 number is: " + number1+number2+number3+number4+
					number5+number6+number7+number8+number9 + "X");
		}else {
			System.out.println("The ISBN-10 number is: " + number1+number2+number3+number4+
					number5+number6+number7+number8+number9+result);
		}
		
		input.close();
		

	}

}
