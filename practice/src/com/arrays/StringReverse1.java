package com.arrays;

import java.util.Scanner;

public class StringReverse1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		// nextLine for string we either use next or nextline to take values from the
		// user next() method ignores the spaces where as nextLine() method doesn’t
		// ignores the spaces if you are given a string such as “hello world” then
		// nextline doesn’t ignores it but when you are trying to reverse it from using
		// next method it ignores the world …

		// if we want to store the string to be reversed then it may need an empty
		// string

		String rev = "";

		// string is nothing but sequence of char

		char[] arr = str.toCharArray();
		// The java string tocharArray() method converts the given string into a
		// sequence of characters

		/*
		 * for (int i = arr.length - 1; i >= 0; i--) { rev = rev + arr[i]; }
		 * System.out.println(rev);
		 */

		for (char x : arr) {
			rev = x + rev;
		}
		System.out.println(rev);
	}

}
