package chapters.chapter_05;

public class Exercise_05 {

	public static void main(String[] args) {

        System.out.println("Kilograms      Pounds    |        Pounds      Kilograms");
        
        for (int i = 1, j = 20; i < 200; i += 2, j += 5) {
        	
            double calcPound = i * 2.2;
            double calcKilo = j / 2.2;
           
            
            System.out.printf("%-15d%-10.1f|%10d%15.1f\n",i,calcPound,j,calcKilo);
        }

	}

}
