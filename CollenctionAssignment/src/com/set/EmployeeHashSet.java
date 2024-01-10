package com.set;


import java.util.LinkedHashSet;

public class EmployeeHashSet {

	public static void main(String[] args) {
    LinkedHashSet<Employee> hs=new LinkedHashSet<>();
    hs.add(new Employee(1,"prachi",90000));
    hs.add(new Employee(2,"pranay",770000));
    hs.add(new Employee(3,"pranali",23000));
    hs.add(new Employee(3,"pranali",23000));
    hs.add(new Employee(4,"reetu",56000));
    
    for(Employee e:hs)
	{
		System.out.println(e);
	}
    

	}

}
