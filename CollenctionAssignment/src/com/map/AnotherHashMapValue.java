package com.map;

import java.util.HashMap;
import java.util.Map;

public class AnotherHashMapValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hs1 = new HashMap<>();
		hs1.put(1, "a");
		hs1.put(2, "b");
		hs1.put(3, "c");

		System.out.println(hs1);

		HashMap<Integer, HashMap<Integer, String>> hm = new HashMap<>();
		hm.put(1, hs1);

		System.out.println(hm);
		
		 for(Map.Entry<Integer,HashMap<Integer,String>>en: hm.entrySet())
	      {
	    	  System.out.println(en.getKey()+"-->"+en.getValue());
	      }

	}

}
