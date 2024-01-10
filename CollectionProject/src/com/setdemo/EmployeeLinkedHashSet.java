package com.setdemo;

import java.util.HashSet;


public class EmployeeLinkedHashSet {

	public static void main(String[] args) {
	HashSet<Employee> lh=new HashSet<>();
	lh.add(new Employee(1,"prachi",90000));
	lh.add(new Employee(2,"pranali",76000));
	lh.add(new Employee(3,"pranay",33000));
	lh.add(new Employee(1,"prachi",67000));
	lh.add(new Employee(5,"reetu",50000));
	
	for(Employee e:lh)
	{
		System.out.println(e);
	}
	

	}

}
