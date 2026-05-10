package Simple;

public class Hello {

	public static void main(String[] args) {

		int num = 7500;

		int hours = num / 3600;

		int remmin = num % 3600;

		int min = remmin / 60;

		int sec = remmin % 60;
		
		System.out.println("Time = " + hours + " hour(s) " + min + " minute(s) " + sec + " second(s)");


	}

}
