package com.arrays;

import java.util.Scanner;

public class StringReverseThird {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value to reverse");

		String str = sc.nextLine();

		String emp = "";

		char[] arr = str.toCharArray();

//		for (int i = arr.length - 1; i >= 0; i--) {
//			emp = emp + arr[i];
//		}
		System.out.println(emp);
	}
}
