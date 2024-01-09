package com.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CustomHashMap2 {

	public static void main(String[] args) {
	HashMap<Student,Course> hm=new HashMap<>();
	hm.put(new Student(101,"ram"),new Course(1,"java"));
	hm.put(new Student(102,"pranay"),new Course(2,"c++"));
	hm.put(new Student(103,"raj"),new Course(3,"react"));
	
	Set<Entry<Student,Course>> entries=hm.entrySet();
	for(Entry<Student,Course> e:entries)
	{
		System.out.println("keys:"+e.getKey()+"--> value "+e.getValue());
	}
	
	

	}

}
