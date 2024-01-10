package com.LinkedandTreeMap;


import java.util.LinkedHashMap;

public class DeleteAllFromLhmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> hs = new LinkedHashMap<>();
		hs.put(1, "A");
		hs.put(2, "B");
		hs.put(3, "C");
		hs.put(4, "D");
        System.out.println(hs);
        
        System.out.println("Remove all:"+hs.remove(hs));
        
	}

}
