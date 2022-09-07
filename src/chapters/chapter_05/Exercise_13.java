package chapters.chapter_05;

public class Exercise_13 {

	public static void main(String[] args) {

		int n = 1;
		double power3 = Math.pow(n, 3);

		while (power3 < 12000) {

			double nPlusPower = Math.pow(n + 1, 3);

			if (nPlusPower > 12000) {
				break;
			} else {
				n++;
			}
		}
		System.out.println("The third force of " + n + " = " + (int) Math.pow(n, 3));
	}

}
