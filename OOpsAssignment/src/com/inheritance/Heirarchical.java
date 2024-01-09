package com.inheritance;

class Employee {
	double leaves = 25.00;
}

class PEmployee extends Employee
{
	float totalHoursPerDay = (float) 8.00;
}

class TEmployee extends Employee
{
	float totalHoursPerDay = (float) 10.50;
}

public class Heirarchical {
	public static void main(String args[]) {
		PEmployee permenant = new PEmployee();
		TEmployee temporary = new TEmployee();
		System.out.println("Permanent Employee Total Number of leaves are :\n" + permenant.leaves);
		System.out.println("Number of working hours for Permanent Employee are:\n" + permenant.totalHoursPerDay);
		System.out.println("Temporary Employee Total Number of leaves are :\n" + temporary.leaves);
		System.out.println("Number of working hours for Temporary Employee are :\n" + temporary.totalHoursPerDay);
	}
}
