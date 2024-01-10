package com.LinkedandTreeMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class UsingGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> hs = new LinkedHashMap<>();
		hs.put(1, "A");
		hs.put(2, "B");
		hs.put(3, "C");
		hs.put(4, "D");
		
		for(Map.Entry<Integer, String> e:hs.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
	}

}
