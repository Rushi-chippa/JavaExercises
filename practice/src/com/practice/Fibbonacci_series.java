package com.practice;

import java.util.Scanner;

public class Fibbonacci_series {

	public static void main(String[] args) {
		int a=0, b=1;
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		for(int z=2;z<=value;z++) {
			System.out.println(" "+z);
		}
	}
}
