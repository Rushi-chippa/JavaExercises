package com.practice;

import java.util.Scanner;

public class Vowels {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check vowels and consonants ");
		String str = sc.nextLine();

		int vowel = 0;
		int consonant = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			} else if (ch >= 'a' && ch <= 'z') {
				consonant++;
			}
		}

		sc.close();
		System.out.println("Vowel count is : \n" + vowel);
		System.out.println("Consonant count is : \n" + consonant);

	}
}
