package com.practice;

import java.util.Scanner;

public class Arraysexample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		double[] darr = new double[5];

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers of arrays ");
		darr[0] = sc.nextDouble();
		darr[1] = sc.nextDouble();
		darr[2] = sc.nextDouble();
		darr[3] = sc.nextDouble();
		darr[4] = sc.nextDouble();

		for (double x : darr) {
			System.out.println(x);
		}

		System.out.println("----------------------");

		for (int i = 0; i < darr.length; i++) {

			System.out.println("enter the value in for loop");
			darr[i] = sc.nextDouble();

		}
		
		for (double x : darr) {
			System.out.println(x);
		}

	}
}
