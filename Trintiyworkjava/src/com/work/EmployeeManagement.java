package com.work;

public class EmployeeManagement {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Employee eob;
		eob = new FullTimeEmp(1500);
		System.out.println("Salary of full time employee -> ");
		System.out.println(eob.calculatesal());

		// --------------------------------------------------------------

		eob = new PartTimeEmp(1000, 40);
		System.out.println("Salary of part time employee -> ");
		System.out.println(eob.calculatesal());

		// --------------------------------------------------------------

		eob = new Intern(5000);
		System.out.println("Stipend of Intern -> ");
		System.out.println(eob.calculatesal());
	}

}
