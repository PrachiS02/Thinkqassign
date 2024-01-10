package com.set;

import java.util.HashSet;
import java.util.TreeSet;

public class CreateTreeSetFromHashSet {

	public static void main(String[] args) {

		HashSet<Integer> hs =new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		TreeSet<Integer> ts=new TreeSet<>(hs);
		System.out.println(ts);
	
	}

}
