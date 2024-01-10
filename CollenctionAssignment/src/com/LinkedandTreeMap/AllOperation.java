package com.LinkedandTreeMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class AllOperation {

	public static void main(String[] args) 
	{
	
		LinkedHashMap<Integer,String> hs = new LinkedHashMap<>();
		hs.put(1, "A");
		hs.put(2, "B");
		hs.put(3, "C");
		hs.put(4, "D");
		
		System.out.println(hs);
		System.out.println("==========================================");
		System.out.println("present value:"+hs.containsValue("C"));
		System.out.println("Remove Map: "+hs.remove(hs));
		//all keys
		System.out.println("============================================");
		for(Map.Entry<Integer,String> e:hs.entrySet())
	      {
	    	  System.out.println(e.getKey());
	      }
		
	}

}
