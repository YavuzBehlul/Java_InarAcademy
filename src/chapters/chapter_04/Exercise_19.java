package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_19 {

	public static void main(String[] args) {
		System.out.print("Enter the first 9 digits of an ISBN: ");
		Scanner input = new Scanner(System.in);
		
		String data = input.nextLine();
		
		int number1  = Integer.parseInt(String.valueOf(data.charAt(0)));
		int number2  = Integer.parseInt(String.valueOf(data.charAt(1)));
		int number3  = Integer.parseInt(String.valueOf(data.charAt(2)));
		int number4  = Integer.parseInt(String.valueOf(data.charAt(3)));
		int number5  = Integer.parseInt(String.valueOf(data.charAt(4)));
		int number6  = Integer.parseInt(String.valueOf(data.charAt(5)));
		int number7  = Integer.parseInt(String.valueOf(data.charAt(6)));
		int number8  = Integer.parseInt(String.valueOf(data.charAt(7)));
		int number9  = Integer.parseInt(String.valueOf(data.charAt(8)));
		
		int result = (number1*1 + number2*2 + number3*3 + number4*4 +
				number5*5 + number6*6 + number7*7 + number8*8 + number9*9)%11;
		
		if(result == 10) {
			System.out.println("The ISBN-10 number is: " + data + "X");
		}else {
			System.out.println("The ISBN-10 number is: " + data + result);
		}
				
		input.close();
		

	}

}
