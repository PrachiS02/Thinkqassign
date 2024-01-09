package com.map;

import java.util.HashMap;
import java.util.Set;

public class IterateOnlyKeyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm1=new HashMap<>();
	     hm1.put(1,"prachi");
	     hm1.put(2,"arpita");
	     hm1.put(3,"reetu");
	     hm1.put(4,"sakshi");
	     
	     Set<Integer> keys=hm1.keySet();
	     for(Integer s:keys)
	     {
	    	 System.out.println(s);
	     }
	    	 
	}

}
