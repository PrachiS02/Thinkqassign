package com.set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		hs.add("Black");
		hs.add("Red");
		hs.add("White");
		hs.add("Blue");
		hs.add("Green");

		System.out.println(hs);
		System.out.println("--------------------------------");
		String arr[] = new String[hs.size()];
		hs.toArray(arr);

		for (String s : arr) {
			System.out.println(s);
		}
	}

}
