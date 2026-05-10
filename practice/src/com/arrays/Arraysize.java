package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the arraysize ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("enter the array elements arr[%d]:", i);
			arr[i] = sc.nextInt();

		}
		System.out.println(arr.toString());
		
		System.out.println(Arrays.toString(arr));
	}

}
