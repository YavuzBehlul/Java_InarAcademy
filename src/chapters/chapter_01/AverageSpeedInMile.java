package W1;

public class AverageSpeedInMile {

	public static void main(String[] args) {
		double mile = 14.0 / 1.6 ;
		//45.0 yapmadıgım zaman sonuc 0 çıkıyordu
		double hour = (45.0 * 60 + 30) / 3600;
		System.out.println(hour);
		System.out.println("Average speed = " + mile / hour);
	}

}
