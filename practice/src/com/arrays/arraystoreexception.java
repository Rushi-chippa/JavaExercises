package com.arrays;

import java.util.Scanner;

public class arraystoreexception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Limit :");
		int x = sc.nextInt();
		int[] arr = new int[x];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter the target element ");
		int target=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(target==arr[i]) {
				System.out.println("the number is matched " + target +" == " + arr[i]);
			}
		}
		
		

	}
}
