package com.collectioncombinemap;

import java.util.HashMap;
import java.util.Set;

public class PutIfAbsentMethodUse {

	public static void main(String[] args) 
	{
		HashMap<String,Integer> hmp=new HashMap<>();
		hmp.put("Prachi",1);
		hmp.put("Pranali",2);
		hmp.put("Pranay",3);
		hmp.put("Reetu",4);
		hmp.put("Arpita",5);
		
		Set<String> keys=hmp.keySet();
	       
	       for(String s:keys)
	       {
	    	   System.out.println(s+"->"+hmp.get(s));
	       }
	     
	       hmp.putIfAbsent("Prachi", 1);
	     

	}

}
