package Simple;

import java.util.Scanner;

public class SwitchStatement {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num > 1 && num <= 10) {
			switch (num) {
			case 1:
				System.out.println("You ordered for idli");
				break;
			case 2:
				System.out.println("You ordered for Plane Dosa");
				break;
			case 3:
				System.out.println("You ordered for Masala Dosa");
				break;
			case 4:
				System.out.println("You ordered for Idli and wada");
				break;
			case 5:
				System.out.println("You ordered for Upma");
				break;
			case 6:
				System.out.println("You ordered for Wada pav");
				break;
			case 7:
				System.out.println("You ordered for Uttapa");
				break;
			case 8:
				System.out.println("You ordered for Sheera");
				break;
			case 9:
				System.out.println("You ordered for Puri and Bhaji");
				break;
			case 10:
				System.out.println("You ordered for Shawarma");
				break;
			}

		} else {
			System.out.println("Entered the number is beyond the range " + num);
		}

	}

}
