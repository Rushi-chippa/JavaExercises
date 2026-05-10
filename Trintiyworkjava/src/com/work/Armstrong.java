package com.work;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {
			if (armstrongcheck(i)) {
				System.out.println(i);
			}
		}

	}

	@SuppressWarnings({ "unused", "resource" })
	static boolean armstrongcheck(int number) {
		Scanner sc = new Scanner(System.in);

//		System.out.print("Enter a number: ");
//		int number = sc.nextInt();

		int sum = 0;
		int remainder = 0;
		int num1 = number;

		while (number != 0) {
			remainder = number % 10;
			sum = sum + (remainder * remainder * remainder);
			number /= 10;

		}
		;
		if (num1 == sum) {
			System.out.println("Armstrong Number : " + num1);
		} /*else {
			System.out.println("Is not An Armstrong Number : " + num1);
		}*/
		return false;
	}

}
