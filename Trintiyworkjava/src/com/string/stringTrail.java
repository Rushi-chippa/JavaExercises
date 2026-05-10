package com.string;

import java.util.Scanner;

public class stringTrail {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		String str1 = "seed ";

		String str2 = "Hello";

		String str5 = "seed ";

		str2 = "solo";

		String str4 = "HEI";

		Scanner sc = new Scanner(System.in);

		String str3 = "Infotech company";

		int len = str1.length();
		// 1. length
		System.out.println("Length of " + str1 + " is : " + len);

		System.out.println(str1.charAt(2));

		System.out.println(str1.codePointAt(1));

		System.out.println(str2.concat(str1));

		System.out.println(str2.contains(str2));

		System.out.println(str2.isEmpty());

		// trim is used just to remove the spaces in the string
		System.out.println(str1.trim());

		System.out.println(str1.toUpperCase());

		System.out.println(str4.toLowerCase());

		System.out.println(str3.replace("company", "Solutions"));

		System.out.println(str1 == str5);

	}
}
