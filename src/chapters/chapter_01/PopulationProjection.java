package chapters.chapter_01;

public class PopulationProjection {

	public static void main(String[] args) {
		int year = 365 * 24 * 60 * 60 ;
		int birth = year / 7 ;
		int death = year / 13 ;
		int immigrant = year / 45 ;
		int for_one_year = (birth - death + immigrant) ;
		int population = 312032486 ;
		
		System.out.println("First year =" + (population + for_one_year));
		System.out.println("Second year =" + (population + for_one_year * 2 ));
		System.out.println("Third year =" + (population + for_one_year * 3));
		System.out.println("Fourth year =" + (population + for_one_year * 4));
		System.out.println("Fifth year =" + (population + for_one_year * 5));
		}

}
