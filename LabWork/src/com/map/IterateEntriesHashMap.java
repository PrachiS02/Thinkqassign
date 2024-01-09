package com.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class IterateEntriesHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,String> hm1=new HashMap<>();
     hm1.put(1,"prachi");
     hm1.put(2,"arpita");
     hm1.put(3,"reetu");
     hm1.put(4,"sakshi");
     
    Set<Entry<Integer,String>> entry=hm1.entrySet();
    for(Entry<Integer,String>en:entry)
    {
    	System.out.println(en.getKey()+"-->"+en.getValue());
    }
    
	}

}
