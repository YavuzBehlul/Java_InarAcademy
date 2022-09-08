package chapters.chapter_05;

public class Exercise_19 {

	public static void main(String[] args) {
		int pow = 0, line = 7;
		
		for (int i = 1; i <= line; i++) {
			
			for (int space = 0; space < line; space++) {
				System.out.print("    ");
			}
			for (int p = 0; p < i; p++) {
				
			int	squareL = (int)(Math.pow(2, p));
			
				System.out.printf("%4d",squareL);
			}
			for (int x = pow; x < line; x++) {
				
				int squareR =(int)(Math.pow(2, (x)));
				
				System.out.printf("%4d", squareR);
			
			}
			pow++;
			line--;
			System.out.println();
		}

	}

}
