package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_18 {

	public static void main(String[] args) {
		System.out.println("Please enter two characters: ");
                

        Scanner input = new Scanner(System.in);
        
        String status = input.nextLine();

        char chr0 = status.charAt(0);
        char year = status.charAt(1);

        String str1 = "";    
        String str2 = "";

        if (chr0 == 'M') {
            str1 = "Mathematics";
        }
        else if (chr0 == 'C') {
            str1 = "Computer Science";
            }       
        else if (chr0 == 'I') {
            str1 = "Information Technology";
            }
        if (year == '1') {
            str2 = "Freshman";
        }
        else if (year == '2') {
            str2 = "Sophomore";
            }
        else if(year == '3') {
            str2 = "Junior";
            }
        else if(year == '4') {
            str2 = "Senior";
            }

        System.out.println(str1 + " " + str2);
        input.close();
	}

}
