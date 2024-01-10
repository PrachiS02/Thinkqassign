package com.map;

import java.util.HashMap;

public class TestForValue {
	public static void main(String[] args) 
	{
		
				HashMap<Integer, String> hs1 = new HashMap<>();
				
				hs1.put(1, "a");
				hs1.put(2, "b");
				hs1.put(3, "c");
				hs1.put(4, "d");
				hs1.put(5, "e");
				System.out.println(hs1);
				System.out.println("value:"+hs1.containsValue("c"));
	}
}
