package com.map;

import java.util.HashMap;
import java.util.Map;

public class CustomHashmap{

	public static void main(String[] args) {
	HashMap<Employee,Department> hs=new HashMap<>();
	hs.put(new Employee(1,"prachi",89000),new Department(101,"HR"));
	hs.put(new Employee(2,"reetu",55000),new Department(101,"HR"));
	hs.put(new Employee(3,"jyoti",43000),new Department(102,"IT"));
	hs.put(new Employee(4,"bhaskar",12000),new Department(102,"IT"));
	
	for(Map.Entry<Employee, Department>e:hs.entrySet())
	{
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		//System.out.println();
	}
	

	}

}
