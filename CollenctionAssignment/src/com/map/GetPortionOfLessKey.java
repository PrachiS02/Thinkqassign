package com.map;

import java.util.HashMap;

public class GetPortionOfLessKey {

	public static void main(String[] args) {

		HashMap<Integer, String> hs1 = new HashMap<>();
		hs1.put(1, "a");
		hs1.put(2, "b");
		hs1.put(3, "c");
		hs1.put(10, "d");
		hs1.put(36, "e");
		hs1.put(11, "f");
		System.out.println(hs1);
		System.out.println("portion of strictly less than key:");
		
	}

}
