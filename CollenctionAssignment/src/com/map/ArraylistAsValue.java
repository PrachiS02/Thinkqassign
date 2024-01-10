package com.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ArraylistAsValue {

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
		
		System.out.println("-----------------------------------------------------------------");
		Set<Entry<String,ArrayList<Integer>>> entries=hm.entrySet();
		for(Entry<String,ArrayList<Integer>>e: entries)
		{
			System.out.println("keys:"+e.getKey()+"--> values:"+e.getValue());
		}
		System.out.println("---------------------------");
	

}
}