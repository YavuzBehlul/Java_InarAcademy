package chapters.chapter_03;
import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		
		int a = (int) (System.currentTimeMillis() % 10);
        int b = (int) (System.currentTimeMillis() / 7 % 10);
        int c = (int) (System.currentTimeMillis() / 6 % 10);

        int theAnswer = a + b + c;


        Scanner input = new Scanner(System.in);

        System.out.print("What is the answer? " + a + " + " + b + " + " + c + " = ");

        int userAnswer = input.nextInt();

        if (userAnswer == theAnswer) {
            System.out.println("Congratulations! That is correct!");
        } else
            System.out.println("Sorry, that is incorrect, please try again...");
        
        input.close();


	}

}
