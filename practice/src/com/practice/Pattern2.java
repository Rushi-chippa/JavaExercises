package com.practice;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows you want to be printed");
		int x = sc.nextInt();
		System.out.println("enter the cols you want to be printed");
		int y = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				if (i == 1 || j == 1 || i == x || j == y) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
				
			}
			System.out.println(" ");
		}
		
	}
}
