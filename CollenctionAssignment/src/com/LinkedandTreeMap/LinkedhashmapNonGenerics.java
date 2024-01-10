package com.LinkedandTreeMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashmapNonGenerics {

	public static void main(String[] args) {
		LinkedHashMap hs = new LinkedHashMap();
		hs.put(1, "A");
		hs.put(2, "B");
		hs.put(3, "C");
		hs.put(4, "D");
		
		System.out.println(hs);
	}

}
