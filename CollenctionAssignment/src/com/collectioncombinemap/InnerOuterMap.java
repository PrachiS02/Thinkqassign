package com.collectioncombinemap;

import java.util.HashMap;
import java.util.Map;

public class InnerOuterMap {

	public static void main(String[] args) {

		HashMap<Integer, String> innerMap1 = new HashMap<>();
		innerMap1.put(1, "One");
		innerMap1.put(2, "Two");

		HashMap<Integer, String> innerMap2 = new HashMap<>();
		innerMap2.put(3, "Three");
		innerMap2.put(4, "Four");

		Map<String, Map<Integer, String>> outermap = new HashMap<>();

		outermap.put("map1", innerMap1);
		outermap.put("map2", innerMap2);

		for (Map.Entry<String, Map<Integer, String>> outerEntry : outermap.entrySet()) {
			String outerkey = outerEntry.getKey();
			Map<Integer, String> innerMap = outerEntry.getValue();
			System.out.println("outer key:" + outerkey);

			for (Map.Entry<Integer, String> innerEntry : innerMap.entrySet()) {
				System.out.println(innerEntry.getKey() + "-->" + innerEntry.getValue());
			}
		}
		System.out.println();

	}

}
