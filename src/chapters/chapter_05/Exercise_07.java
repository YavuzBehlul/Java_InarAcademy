package chapters.chapter_05;

public class Exercise_07 {

	public static void main(String[] args) {

		double tuition = 10_000;
		int year = 0;
		int total4 = 0;

		while (year < 14) {
			tuition += tuition * 0.05;

			if (year < 10) {
				System.out.println((year + 1) + " annual tuition: " + Math.round(tuition));
			} else {
				total4 += tuition;
			}

			year++;
		}
		System.out.println("Total tuition for 4 years: " + total4);
	}

}
