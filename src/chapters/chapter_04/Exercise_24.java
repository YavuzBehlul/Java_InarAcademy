package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_24 {

	public static void main(String[] args) {
		
		String tempCity = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String cityFirst = input.next();
        cityFirst =cityFirst.toLowerCase();

        System.out.print("Enter the second city: ");
        String citySecond = input.next();
        citySecond =citySecond.toLowerCase();

        System.out.print("Enter the third city: ");
        String cityThird = input.next();
        cityThird =cityThird.toLowerCase();

        if (cityFirst.compareTo(citySecond) > 0) {
            tempCity = citySecond;
            citySecond = cityFirst;
            cityFirst = tempCity;
            }

         
        if (citySecond.compareTo(cityThird) > 0) {
                tempCity = cityThird;
                cityThird = citySecond;
                citySecond = tempCity;
            }


        if(cityFirst.compareTo(citySecond) > 0) {
            tempCity = citySecond;
            citySecond = cityFirst;
            cityFirst = tempCity;
            }

        System.out.println("The cities in alphabetical order are: "
                + cityFirst + " " + citySecond + " " + cityThird);
        
        input.close();



	}

}
