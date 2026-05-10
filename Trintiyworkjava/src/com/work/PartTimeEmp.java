package com.work;

public class PartTimeEmp implements Employee {

	@SuppressWarnings("unused")
	private double hourlysal;
	@SuppressWarnings("unused")
	private int hoursworked;

	public PartTimeEmp(double sal, int hours) {

		this.hourlysal = sal;
		this.hoursworked = hours;
		
	}

	@Override
	public double calculatesal() {
		this.hourlysal = 0;
		return 0;
	}
}
