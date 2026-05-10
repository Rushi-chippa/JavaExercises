package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

import com.string.string;

public class One {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("my");
		list.add("name");
		list.add("is");
		list.add("rushi");
		System.out.println("Object one data is :");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Adv. JAVA");
		list2.add("C#");

		System.out.println("Object two data is :");
		Iterator<String> itr2 = list2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("Object third data is :");
		list.addAll(2, list2);
		Iterator<String> itr3 = list2.iterator();
		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}
	}

}
