package com.arrays;

public class A {

	int x=10;
	void display()
	{
		System.out.println("parent "+x);
	}

};
class B extends A
{
	int x=20;
	void display()
	{
		System.out.println("child "+x);
	}
}
class Follow
{
	public static void main(String[] args) {
		A s = new B();
		s.display();
		System.out.println("value of "+s.x);
	}
}
