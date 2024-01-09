package com.ovveriding;

class Programmer
{
	void workingHourse()
	{
		System.out.println("working hourse is 8 hrs");
	}
}

class Employee extends Programmer
{
	void workingHourse()
	{
		super.workingHourse();
		System.out.println("working hourse is 9 hrs");
	}

}
public class ProgEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee();
		e1.workingHourse();
	}

}
