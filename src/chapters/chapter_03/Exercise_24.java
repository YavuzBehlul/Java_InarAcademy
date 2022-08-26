package chapters.chapter_03;

// i use random method
import java.util.Random;

public class Exercise_24 {

	public static void main(String[] args) {

		int randomCard, randomSuit;

		randomCard = new Random().nextInt(13);
		randomSuit = new Random().nextInt(5);

		String card = "";
		String suit = "";

		switch (randomCard) {
		case 0:
			card += "Ace";
			break;
		case 1:
			card += "1";
			break;
		case 2:
			card += "2";
			break;
		case 3:
			card += "3";
			break;
		case 4:
			card += "4";
			break;
		case 5:
			card += "5";
			break;
		case 6:
			card += "6";
			break;
		case 7:
			card += "7";
			break;
		case 8:
			card += "8";
			break;
		case 9:
			card += "9";
			break;
		case 10:
			card += "10";
			break;
		case 11:
			card += "Jack";
			break;
		case 12:
			card += "Queen";
			break;
		case 13:
			card += "King";
			break;

		}
		switch (randomSuit) {
		case 0:
			suit += "Clups.";
			break;
		case 1:
			suit += "Diamonds.";
			break;
		case 2:
			suit += "Hearts.";
			break;
		case 3:
			suit += "Spades.";
			break;
		}
		System.out.println("The card you picked is " + card + " of " + suit);

	}
}
