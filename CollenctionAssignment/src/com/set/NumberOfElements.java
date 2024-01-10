package com.set;

import java.util.HashSet;

public class NumberOfElements {

	
	public static void main(String[] args) {
		HashSet<Integer> hs =new HashSet<>();
	       hs.add(8);
	       hs.add(5);
	       hs.add(3);
	       hs.add(4);
	       
	       System.out.println(hs);
	       System.out.println("number of elements:"+hs.size());

	}

}
