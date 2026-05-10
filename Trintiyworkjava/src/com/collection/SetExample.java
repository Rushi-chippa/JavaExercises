package com.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<Integer> hset = new HashSet<Integer>();

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of elements to store ");
			int count = sc.nextInt();
			for (int i = 1; i <= count; i++) {
				System.out.println("Enter element at position : "+i);
				hset.add(sc.nextInt());
			}
			System.out.println(hset);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
