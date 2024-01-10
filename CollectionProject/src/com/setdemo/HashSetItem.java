package com.setdemo;

import java.util.HashSet;

public class HashSetItem {

	public static void main(String[] args) {

		HashSet<Item> hs = new HashSet<>();
		hs.add(new Item(1, "sugar", 67));
		hs.add(new Item(2, "flour", 89));
		hs.add(new Item(3, "salt", 61));
		hs.add(new Item(4, "tea", 100));
		hs.add(new Item(5, "sugar", 40));

		for (Item i : hs) {
			System.out.println(i);
		}

	}

}
