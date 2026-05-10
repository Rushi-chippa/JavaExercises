package com.arrays;

import java.util.Scanner;

public class arrays_max_min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit of an array");
		int x = sc.nextInt();
		int[] arr = new int[x];

		int max = 0, min = 0;
		for (int i = 0; i < x; i++) {
			System.out.printf("enter the elements of array arr[%d] :", x);
			arr[x] = sc.nextInt();
		}

	}
}
