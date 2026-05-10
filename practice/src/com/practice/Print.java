package com.practice;

import java.util.Scanner;

public class Print {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int x = sc.nextInt();
		for (int i = 2;i<=512;i=i*2) {
			System.out.println(i);
		}
	}
}
