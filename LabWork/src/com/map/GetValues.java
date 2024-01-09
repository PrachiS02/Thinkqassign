package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class GetValues {

	public static void main(String[] args) {
		HashMap<String,Integer> hm2=new HashMap();
		
        hm2.put("prachi",101);
        hm2.put("arpita",102);
        hm2.put("reetu",103);
        hm2.put("sakshi",104);
        
        Collection<Integer> val=hm2.values();
        
        for(Integer i:val)
        {
        	System.out.println(i);
        }
        
	     
	   
	}

}
