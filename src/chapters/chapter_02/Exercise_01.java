package chapters.chapter_02;

import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {
	  double celsius ;
	  double fahrenheit ;
	  
	  System.out.println("Enter degrees in Celsius");
	  
	  Scanner inputDeegre = new Scanner(System.in);
	  celsius = inputDeegre.nextDouble();
	  fahrenheit = (9.0 / 5.0 * celsius + 32);
	  
	  System.out.println(fahrenheit);
	  
	  inputDeegre.close();
	  

	}

}
