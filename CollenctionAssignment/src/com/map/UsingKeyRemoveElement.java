package com.map;

import java.util.HashMap;

public class UsingKeyRemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				HashMap<Integer, String> hs1 = new HashMap<>();
				
				hs1.put(1, "a");
				hs1.put(2, "b");
				hs1.put(3, "c");
				hs1.put(4, "d");
				hs1.put(5, "e");
				System.out.println(hs1);
				System.out.println("remove element:"+hs1.remove(3));
				System.out.println(hs1);
	}

}
