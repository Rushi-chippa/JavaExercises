package com.work;

class Developer {
	public void devApp(Computer lap) { // tight coupling
		// System.out.println("Hello coding");
		lap.code();
	}
}

abstract class Computer {
	abstract public void code();

}

class Laptop extends Computer {
	public void code() {
		System.out.println("Code,compile ... run");
	}
}

class Desktop extends Computer {
	public void code() {
		System.out.println("Hello run code fast.....");
	}
}

public class Demo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		Laptop lap = new Laptop();
//
		Developer hi = new Developer();
//		//hi.devApp(lap);
//
//		Desktop desk = new Desktop();
//		hi.devApp(desk);
//		
		Computer cm = new Laptop();
		Computer cp = new Desktop();
		
		cm.code();

	}

}