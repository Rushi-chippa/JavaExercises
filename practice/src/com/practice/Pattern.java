package com.practice;

public class Pattern {
	public static void main(String[] args) {
//		int a = 11, b = 22, c;
//		c = a + b + a++ + b++ + ++a + ++b;
//		System.out.println(c);

		int i = 0;
		i = i++ - --i + ++i - i--;
		System.out.println(i);
	}
}
