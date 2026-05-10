package com.arrays;

import java.util.Scanner;

public class Maxnumberarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int x = sc.nextInt();

		int[] arr = new int[x];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the array elements");
			arr[i] = sc.nextInt();
		}

		int max = 0;
		int min = 0;
		max = arr[0];
		min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("array is maximum " + max);
		System.out.println("array is minimum " + min);

	}

}
