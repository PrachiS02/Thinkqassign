package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayListHashMap {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(2);
		al.add(3);

		HashMap<String, ArrayList<Integer>> hm = new HashMap<>();
		
		// 12.store value
		hm.put("List1", al);
		hm.put("List2", al);
		hm.put("List3", al);
		
		System.out.println(hm);

		System.out.println("-------------------------------------");
		// 13 iterate the arraylist store in map
		Set<Entry<String,ArrayList<Integer>>> entries=hm.entrySet();
		for(Entry<String,ArrayList<Integer>>e: entries)
		{
			System.out.println("keys:"+e.getKey()+"--> values:"+e.getValue());
		}
		System.out.println("---------------------------");

	}

}
