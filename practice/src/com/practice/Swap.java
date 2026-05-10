package com.practice;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first values");
		int x = sc.nextInt();
		System.out.println("enter the second value");
		int y = sc.nextInt();
		
		int c;
		
		System.out.println("before swapping the values are " +x+ " & " +y);
		
		c=x;
		x=y;
		y=c;
		
		System.out.println("after swapping the values are " +x+ " & " +y);

		
	}
}
