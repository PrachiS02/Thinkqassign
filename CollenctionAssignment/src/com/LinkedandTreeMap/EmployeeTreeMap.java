package com.LinkedandTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMap {

	public static void main(String[] args) {
	TreeMap<Employee,String> tmp=new TreeMap<>();
	tmp.put(new Employee(3,"prachi",90000),"IT");
	tmp.put(new Employee(5,"reetu",45000),"HR");
	tmp.put(new Employee(2,"anjali",12000),"IT");
	tmp.put(new Employee(4,"sakshi",4000),"HR");
	tmp.put(new Employee(1,"viraj",39000),"IT");
	
	for(Map.Entry<Employee, String>e:tmp.entrySet())
    {
 	   System.out.println(e.getKey()+"-->"+e.getValue());
    }	

	}

}
