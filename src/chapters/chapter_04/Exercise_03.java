package chapters.chapter_04;

public class Exercise_03 {

	public static void main(String[] args) {
		/*
		 * -84.39,   33.74 Atlanta
         * -81.37,   28.54 Orlando
         * -81.09,   32.05 Savannah
         * -80.84,   35.22 Charlotte
		 * d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
		 * s = (side1 + side2 + side3)/2; area = SQRT((s - side1)(s - side2)(s - side3))
		 */
		double radius = 6371.01; 

		
		double atlantaToCharlotte, charlotteToSavannah, savannahToAtlanta;

		atlantaToCharlotte = radius * Math.acos(Math.sin(-84.39) * Math.sin(-81.37)
				+ Math.cos(-84.39) * Math.cos(-81.37) * Math.cos(33.74 - 32.10));

		charlotteToSavannah = radius * Math.acos(Math.sin(-80.95676) * Math.sin(-81.17461)
				+ Math.cos(-80.95676) * Math.cos(-81.1746100) * Math.cos(35.20724 - 32.1081500));

		savannahToAtlanta = radius * Math.acos(Math.sin(-81.17461) * Math.sin(-84.27822)
				+ Math.cos(-81.1746100) * Math.cos(-84.27822) * Math.cos(32.10815 - 33.8901));

		

		
		double savannahToOrlando, orlandoToAtlanta;

		savannahToOrlando = radius * Math.acos(Math.sin(-81.17461) * Math.sin(-81.5197542)
				+ Math.cos(81.17461) * Math.cos(-81.5197542) * Math.cos(32.10815 - 28.4283959));

		orlandoToAtlanta = radius * Math.acos(Math.sin(-84.27822) * Math.sin(-81.519754)
				+ Math.cos(81.17461) * Math.cos(-81.5197542) * Math.cos(33.8901000 - 28.4283959));

		

		
		

	}

}


	


