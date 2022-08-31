package weeks.week_03;

import java.util.Scanner;

public class Assignment_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Your salary?");
		double salary = input.nextDouble();
		
		System.out.println("year?");
		int year = input.nextInt();
		
		if(year > 5) {
			System.out.println("New salary"+((salary *0.05)+ salary));
			
		}else System.err.println("Your salary is" + salary);
		input.close();

	}

}
