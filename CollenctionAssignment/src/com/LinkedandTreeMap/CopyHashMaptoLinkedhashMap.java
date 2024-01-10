package com.LinkedandTreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CopyHashMaptoLinkedhashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<>();
		hs.put(1, "A");
		hs.put(2, "B");
		hs.put(3, "C");
		hs.put(4, "D");
        System.out.println(hs);
        System.out.println("============================================================");
		LinkedHashMap<Integer, String> hsmp = new LinkedHashMap<>();
		hsmp.putAll(hs);
		System.out.println(hsmp);

	}

}
