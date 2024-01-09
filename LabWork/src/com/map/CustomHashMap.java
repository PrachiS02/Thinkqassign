package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CustomHashMap {

	public static void serachKey(HashMap<Integer, Employee> emp, int key) {
		boolean found = false;
		Set<Integer> keysIntegers = emp.keySet();
		for (Map.Entry<Integer, Employee> en : emp.entrySet()) {
			if (en.getKey() == key) {
				System.out.println("key found");
				System.out.println(en.getValue());
				found = true;
				break;
			} else
				found = false;
		}
		if (!found)
			System.out.println("key not found");

	}

	public static void main(String[] args) {

		HashMap<Integer, Employee> emphm = new HashMap<>();
		emphm.put(1, new Employee(101, "prachi"));
		emphm.put(2, new Employee(102, "arpita"));
		emphm.put(3, new Employee(103, "pranay"));
		emphm.put(4, new Employee(104, "pranali"));
		emphm.put(5, new Employee(105, "prabhat"));

		Set<Integer> keys = emphm.keySet();
		for (int i : keys) {
			System.out.println(i + "->" + emphm.get(i));
		}

		System.out.println("-------------------");
		serachKey(emphm, 1);
 
 
 
 
	}

}
