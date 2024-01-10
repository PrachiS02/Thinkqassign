package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapNonGeneric {

	public static void main(String[] args) 
	{
		HashMap hs = new HashMap();
		hs.put(1, "a");
		hs.put(2, "b");
		hs.put(3, "c");
		hs.put(4, "d");
		hs.put(5, "e");

		System.out.println(hs);
		System.out.println("-------------------------------------------------------------------");

		HashMap<Integer, String> hs1 = new HashMap<>();
		hs1.put(1, "a");
		hs1.put(2, "b");
		hs1.put(3, "c");
		hs1.put(4, "d");
		hs1.put(5, "e");
		for (Map.Entry<Integer, String> e : hs1.entrySet())
		{
			System.out.println(e.getKey() + "->" + e.getValue());	
			
		}
		System.out.println("---------------------------------------------------------------------");
		
		HashMap< String,Integer> hs2 = new HashMap<>();
		hs2.put("a",1);
		hs2.put("b",2);
		hs2.put("c",3);
		hs2.put("d",4);
		hs2.put("e",5);
		for (Map.Entry<String,Integer> e : hs2.entrySet())
		{
			System.out.println(e.getKey() + "->" + e.getValue());	
			
		}

	}

}
