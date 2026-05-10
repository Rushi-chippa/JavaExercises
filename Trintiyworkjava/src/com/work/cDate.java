package com.work;

import java.util.Scanner;

public class cDate {

	int day;
	int month;
	int year;

	void accept(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}

	@SuppressWarnings({ "unused", "resource" })
	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		day = sc.nextInt();
		System.out.println("Enter the month");
		month = sc.nextInt();
		System.out.println("Enter the year");
		year = sc.nextInt();
	}

//	void display() {
//		System.out.println("Date is :" + day + "\n month is : " + month + "\nYear is : " + year);
//	}

	void display() {
		System.out.println("Date is :" + day + "\n" + " month is : " + month + "\nYear is : " + year);
	}

	public static void main(String[] args) {
		cDate cc = new cDate();
		System.out.println(cc);
		cc.accept(10, 02, 2003);
		cc.accept();
		cc.display();

	}
}
