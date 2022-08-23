package chapters.chapter_02;

import java.util.Scanner; ;

public class Exercise_08 {

	public static void main(String[] args) {
		
		System.out.println("Enter the time zone offset to GMT : ");
		
		Scanner input = new Scanner(System.in);
		int gmt = input.nextInt();
		
		long totalMilSec = System.currentTimeMillis();
		
		long totalSec = totalMilSec / 1000 ;
		long totalMin = totalSec / 60 ;
		long totalHour = totalMin / 60 ;
		
		long currentSec = totalSec % 60 ;
		long currentMin = totalMilSec % 60 ;
		long currentHour = totalHour % 24 ;
		
		currentHour += gmt ;
		
		System.out.println("Your current time is " + currentHour +
				" : " + currentMin + " : " + currentSec);
		input.close();
		
	}

}
