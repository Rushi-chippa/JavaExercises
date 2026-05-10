package com.collection;

import java.util.Iterator;
import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();

		st.push(10);
		st.push(20);
		st.push(30);

		System.out.println("Elements in stack after push() operation are: ");
		Iterator itr = st.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println( );

		System.out.println("Remove element from stack : " + st.pop());
		Iterator itr1 = st.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
