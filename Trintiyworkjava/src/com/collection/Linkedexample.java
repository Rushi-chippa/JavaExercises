package com.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedexample {

	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		link.add("Apple");
		link.add("Banana");
		link.add("Pineapple");
		System.out.println("The first object data is : ");
		Iterator<String> itr = link.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();
		System.out.println("The second object data is : ");
		LinkedList<String> link2 = new LinkedList<String>();
		link.add(2, "Orange");
		Iterator<String> itr1 = link.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println();
		System.out.println("The third object data is : ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the specific position you want to add ");
		int pos = sc.nextInt();
		if (pos < link.size()) {
			link.add(pos - 1, "strawberry");
		} else {
			System.out.println("Not valid position");
		}
		System.out.println("Contents afteer adding element :");
		Iterator<String> itr4 = link2.iterator();
		while (itr4.hasNext()) {
			System.out.println(itr4.next());
		}
	}

}
