package com.map;

import java.util.HashMap;
import java.util.Map;

public class StudenthashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Student> sh = new HashMap<>();
		sh.put(1, new Student(101, "prachi"));
		sh.put(2, new Student(102, "reetu"));
		sh.put(3, new Student(103, "jyoti"));

		for (Map.Entry<Integer, Student> e : sh.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("----------------------------");
		}

	}

}
