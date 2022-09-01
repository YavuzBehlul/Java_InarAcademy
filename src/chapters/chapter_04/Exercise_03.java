package chapters.chapter_04;

public class Exercise_03 {

	public static void main(String[] args) {
		/*
		 * -84.39,   33.74 Atlanta
         * -81.37,   28.54 Orlando
         * -81.09,   32.05 Savannah
         *-80.84,   35.22 Charlotte
		 *
		 * d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
		 *
		 * s = (side1 + side2 + side3)/2 
		 * area = SQRT((s - side1)(s - side2)(s - side3))
		 */
		double radius = 6_371.01;
		
		double lat1 = -84.39;
		double lat2 = -81.37;
		double lat3 = -81.09;
		double lat4 = -80.84;
		
		double lon1 = 33.74;
		double lon2 = 28.54;
		double lon3 = 32.05;
		double lon4 = 35.22;
		
       
        double atlantaToCharlotte, charlotteToSavannah, savannahToAtlanta;

        atlantaToCharlotte = radius * Math.acos(Math.sin(lat1) * Math.sin(lat4)
                + Math.cos(lat1) * Math.cos(lat4) * Math.cos(lon1 - lon4));

        charlotteToSavannah = radius * Math.acos(Math.sin(lat4) * Math.sin(lat3)
                + Math.cos(lat4) * Math.cos(lat3) * Math.cos(lon4 - lon3));

        savannahToAtlanta = radius * Math.acos(Math.sin(lat3) * Math.sin(lat1)
                + Math.cos(lat3) * Math.cos(lat1) * Math.cos(lon3 - lon1));

       
        double s1 = (atlantaToCharlotte + charlotteToSavannah + savannahToAtlanta) / 2;
        double area1 = Math.sqrt(s1 * (s1 - atlantaToCharlotte) * (s1 - charlotteToSavannah) * (s1 - savannahToAtlanta));

        
        double savannahToOrlando, orlandoToAtlanta;

        savannahToOrlando = radius * Math.acos(Math.sin(lat3) * Math.sin(lat2)
                + Math.cos(lat3) * Math.cos(lat2) * Math.cos(lon3 - lon2));

        orlandoToAtlanta = radius * Math.acos(Math.sin(lat2) * Math.sin(lat1)
                + Math.cos(lat2) * Math.cos(lat1) * Math.cos(lon2 - lon1));

        

        double s2 = (savannahToOrlando + orlandoToAtlanta + savannahToAtlanta) / 2;
        double area2 = Math.sqrt(s2 * (s1 - savannahToOrlando) * (s1 - orlandoToAtlanta) * (s1 - savannahToAtlanta));
        
        double totalArea = area1 + area2;
        
        System.out.println("Total area of cities: " + totalArea);
        System.out.println("The distance between Atlanta and Charlotte: " + atlantaToCharlotte);
        System.out.println("The distance between Charlotte and Savannah: " + charlotteToSavannah);
        System.out.println("The distance between Savannah and Atlanta: " + savannahToAtlanta);
        System.out.println("The distance between Savannah and Orlando: " + savannahToOrlando);
        System.out.println("The distance between Orlando and Atlanta: " + orlandoToAtlanta);
        
    }

}


	


