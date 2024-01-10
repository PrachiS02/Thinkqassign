package com.LinkedandTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class SearchValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tmp = new TreeMap<>();
		tmp.put("A", "a");
		tmp.put("B", "b");
		tmp.put("C", "c");
		tmp.put("D", "d");

		for (Map.Entry<String, String> e : tmp.entrySet()) {
			System.out.println(e.getKey() + "->" + e.getValue());
		}

		System.out.println("search value:" + tmp.containsValue("b"));
	}

}
