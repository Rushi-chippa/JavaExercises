package com.string;

public class string {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Welcome to ");

		StringBuffer sb1 = new StringBuffer(" the ");

		StringBuffer sb2 = new StringBuffer("class");

		// 1.append

		System.out.println("Modified things : " + sb.append(" India "));

		// 2.replace

		System.out.println("Original string is : " + sb1);
		System.out.println("replaced string is : " + sb2.replace(2, 4, "sss"));

	}

}
