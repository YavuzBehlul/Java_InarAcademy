package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a hex digit: ");

        int userInput = input.nextInt();

        if (userInput > 15 || userInput < 0) {
            System.out.println("Invalid number.");
        }
        
        int binaryInt;
        binaryInt =0;
        
        if (userInput >= 0 && userInput <= 9) {
        	
            switch(userInput) {
            case 0:
            	binaryInt += 0000;
            	break;
            case 1:
            	binaryInt += 0001;
            	break;
            case 2:
            	binaryInt += 0010;
            	break;
            case 3:
            	binaryInt += 0011;
            	break;
            case 4:
            	binaryInt += 0100;
            	break;
            case 5:
            	binaryInt += 0101;
            	break;
            case 6:
            	binaryInt += 0110;
            	break;
            case 7:
            	binaryInt += 0111;
            	break;
            case 8:
            	binaryInt += 1000;
            	break;
            case 9:
            	binaryInt += 1001;
            	break;
                       	
            }
        }
       
        switch (userInput) {
            case 10:
            	binaryInt += 1010;
                break;

            case 11:
            	binaryInt += 1011;
                break;

            case 12:
            	binaryInt += 1100;
                break;

            case 13:
            	binaryInt += 1101;
                break;

            case 14:
            	binaryInt += 1110;
                break;

            case 15:
            	binaryInt += 1111;
                break;
            default:
            	System.out.println(userInput + " is an invalid input.");
            	
                
                                
        }
        System.out.println("The binary value is " + binaryInt);
        input.close();

	}
}


