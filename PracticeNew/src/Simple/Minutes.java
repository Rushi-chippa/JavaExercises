package Simple;

import java.util.Scanner;

public class Minutes {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the number to convert into hours and minutes and seconds");

		int num = sc.nextInt();

		calc(num);

	}

	public static void calc(int num) {

		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		if (num >= 3600) {
			hours = num / 3600;
			int remainingSeconds = num % 3600;

			minutes = remainingSeconds / 60;
			seconds = remainingSeconds % 60;

			System.out.println(hours + " Hours " + minutes + " Minutes " + seconds + " Seconds");

		} else if (num > 60) {
//			int hours = num / 3600;
//			int remainingSeconds = num % 3600;

			minutes = num / 60;
			seconds = num % 60;
			System.out.println(minutes + " Minutes " + seconds + " Seconds");
		} else if (num < 60) {
			seconds = num % 60;
			System.out.println(seconds + " Seconds");
		}

//		int hours = num / 3600;
//		int remainingSeconds = num % 3600;
//
//		int minutes = remainingSeconds / 60;
//		int seconds = remainingSeconds % 60;

//		System.out.println(hours + " Hours " + minutes + " Minutes " + seconds + " Seconds");

	}

}
