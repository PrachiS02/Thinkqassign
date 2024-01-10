package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args)
	{
		ArrayList<Employee> ls = new ArrayList<>();
		
		ls.add(new Employee(1,"akshay","manager",26));
		ls.add(new Employee(3,"prachi","developer",25));
		ls.add(new Employee(2,"prachi","HR",25));
		ls.add(new Employee(4,"sayali","Tester",25));
		
	
		Collections.sort(ls);
		for (Employee s : ls) 
		{
			System.out.println(s);
		}
        
	}

}
