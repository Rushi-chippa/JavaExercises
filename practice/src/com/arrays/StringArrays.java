package com.arrays;

public class StringArrays {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		int total = 0;

		for (int x : arr) {
			
			total = x + total;
			
		}
		System.out.println(total);

	}
}
