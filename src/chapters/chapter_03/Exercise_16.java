package chapters.chapter_03;

public class Exercise_16 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 100);
		int xN = (int) (Math.random() * 100) * -1;
		int y = (int) (Math.random() * 200);
		int yN = (int) (Math.random() * 200) * -1;

		int chance = (int) ((Math.random() * 100));

		if (chance <= 25) {
			System.out.println("Random point: " + x + "  " + y);

		} else if (chance > 25 && chance <= 50) {
			System.out.println("Random point: " + xN + "  " + y);

		} else if (chance > 50 && chance <= 75) {
			System.out.println("Random point: " + xN + "  " + yN);

		} else {
			System.out.println("Random point: " + x + "  " + yN);

		}

	}
}