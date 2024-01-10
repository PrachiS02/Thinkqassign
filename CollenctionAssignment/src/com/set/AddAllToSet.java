package com.set;

import java.util.HashSet;

public class AddAllToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<>();
		hs.add("Black");
		hs.add("Red");
		hs.add("White");
		hs.add("Blue");
		hs.add("Green");

		System.out.println(hs);

		HashSet<String> hs1 = new HashSet<>();
		hs1.addAll(hs);
		System.out.println(hs1);

	}

}
