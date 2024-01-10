package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapWrrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> hs1 = new HashMap<>();
		hs1.put(1, 1);
		hs1.put(2, 2);
		hs1.put(3, 3);
		hs1.put(4, 4);
		hs1.put(5, 5);
		for (Map.Entry<Integer, Integer> e : hs1.entrySet())
		{
			System.out.println(e.getKey() + "->" + e.getValue());	
			
		}
		System.out.println("size of map:"+hs1.size());
	}

}
