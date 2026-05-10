package Simple;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = sc.next().charAt(0);
		ch = Character.toLowerCase(ch);

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			vowel();
			break;
		default:
			consonant();
		}

	}

	private static void consonant() {
		System.out.println("You entered the consonant" );
	}

	private static void vowel() {
		System.out.println("You entered the vowel" );
	}

}
