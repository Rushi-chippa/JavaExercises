package com.work;

public class FullTimeEmp implements Employee {

	private double monthlySal;

	FullTimeEmp(double sal) {
		this.monthlySal = sal;
	}
	
	@Override
	public double calculatesal() {
		return this.monthlySal;

	}

}
