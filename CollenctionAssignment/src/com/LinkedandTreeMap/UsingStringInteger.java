package com.LinkedandTreeMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class UsingStringInteger {

	public static void main(String[] args) {

		LinkedHashMap<String,Integer> hs = new LinkedHashMap<>();
		hs.put("A",1);
		hs.put("B",2);
		hs.put("C",3);
		hs.put("D",4);
		
		for(Map.Entry<String,Integer> e:hs.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
	}

}
