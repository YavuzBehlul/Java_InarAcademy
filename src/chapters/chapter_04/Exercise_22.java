package chapters.chapter_04;

import java.util.Scanner;

public class Exercise_22 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
	        System.out.print("Enter string str1: ");
	        String str1 = input.next();
	        
	        System.out.print("Enter string str2: ");
	        String str2 = input.next();

	        int longestLength = Math.max(str1.length(), str2.length());	        
	        	        
	        String isA = " is a substring of ";
	        String isNot = " is not a substring of";
	        
	        String big, small;

	        if (longestLength == str1.length()) {
	            big = str1;
	            small = str2;

	        } else {
	            big = str2;
	            small = str1;
	        }
	        String result = "";
	        if (big.contains(small)) {
	            result += isA;
	        } else {
	            result += isNot;
	        }


	        System.out.print(small + result +  big);
	        input.close();
	}

}
