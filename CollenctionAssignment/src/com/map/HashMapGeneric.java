package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
