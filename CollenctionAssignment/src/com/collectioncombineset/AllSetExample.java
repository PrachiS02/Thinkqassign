package com.collectioncombineset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AllSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<>();

		hs.add(10);
		hs.add(1);
		hs.add(3);
		System.out.println(hs);
		
		System.out.println("==========================================================");
		
		LinkedHashSet<Integer> hs1 = new LinkedHashSet<>();

		hs1.add(11);
		hs1.add(12);
		hs1.add(33);
		System.out.println(hs1);
		
		System.out.println("==========================================================");
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(67);
		ts.add(89);
		ts.add(56);
		System.out.println(ts);
		
		System.out.println("==========================================================");
		
		
		
		
		
		
	}
	
	

}
