package com.Masterassignment;

import java.util.Comparator;

public class Emp3NameComparator implements Comparator<Employee3> {

	@Override
	public int compare(Employee3 o1, Employee3 o2) {
		
		
			return o1.getName().compareTo(o2.getName());
		
			
	}

}
