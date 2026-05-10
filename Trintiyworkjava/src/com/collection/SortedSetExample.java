package com.collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<String> tset = new TreeSet<String>();
		tset.add("d");
		tset.add("b");
		tset.add("c");
		tset.add("a");

		Iterator it = tset.iterator();

		System.out.println("Data in sorted form : ");
		while (it.hasNext()) {
			Object ele = it.next();
			System.out.println(ele.toString());
		}
		tset.remove("c");
		Iterator itr = tset.iterator();
		System.out.println("Data after removing element : ");
		while (itr.hasNext()) {
			Object ele1 = itr.next();
			System.out.println(ele1.toString());
		}

	}

}
