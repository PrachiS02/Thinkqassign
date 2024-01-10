package com.LinkedandTreeMap;

import java.util.LinkedHashMap;

public class NonGenericStringDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap hs = new LinkedHashMap();
		hs.put( "A", 1);
		hs.put( "B",0.5f);
		hs.put( "C","Class");
		hs.put ("D",8.9);
		
		System.out.println(hs);
	}

}
