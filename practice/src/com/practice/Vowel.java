package com.practice;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line ");
		String input =sc.nextLine();
		
		int vowel=0;
		int consonant=0;
		
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);

			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowel++;
			}
			else
			{
				consonant++;
			}
		}
		
		System.out.println("The value of vowels is "+vowel);
		System.out.println("The value of consonant is "+consonant);
		
		
	}

}
