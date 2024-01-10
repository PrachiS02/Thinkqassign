package com.HashmapDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) 
	{
		LinkedHashMap<String,Double> lmap=new LinkedHashMap<>(10,0.9f,true);
		lmap.put("abhay", 98.3);
		lmap.put("raj", 56.4);
		lmap.put("rani", 23.5);
		lmap.put("mansi", 89.1);
		
		for(Map.Entry<String, Double> e:lmap.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
		System.out.println(lmap.get("rani"));
		System.out.println("----------------------------");
		
		for(Map.Entry<String, Double> e:lmap.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}

	}

}
