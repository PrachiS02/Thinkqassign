package com.Masterassignment;

import java.util.ArrayList;
import java.util.Collections;

public class Employee3Test {
	public static void main(String[] args) { 
		ArrayList<Employee3> alEmp = new ArrayList<>(); 
		Employee3 e1 = new Employee3(3, "Ajit"); 
		Employee3 e2 = new Employee3(4,"Suman") ; 
		Employee3 e3 = new Employee3(2, "Radhika" ) ; 
		Employee3 e4 = new Employee3(1, "Sameer") ; 
		alEmp.add(e1); 
		alEmp.add(e2); 
		alEmp.add(e3); 
		alEmp.add(e4);
		
		Collections.sort(alEmp,new Emp3NameComparator());
		System.out.println(alEmp);

	}
}