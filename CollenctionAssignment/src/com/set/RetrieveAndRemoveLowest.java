package com.set;

import java.util.TreeSet;

public class RetrieveAndRemoveLowest {

	public static void main(String[] args) {
	       TreeSet<Integer> ts=new TreeSet<>();
	         ts.add(1);
	         ts.add(2);
	         ts.add(3);
	         ts.add(4);
	         
	        System.out.println(ts);
	         
	         System.out.println("Lowest element:"+ts.pollFirst());
	         System.out.println("Strictly lower:"+ts.lower(9));
	         System.out.println("Striclty lower:"+ts.floor(5));
	}

}
