package com.set;

import java.util.HashSet;

public class ComparetwohashSet {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
	     hs.add("Black");
	     hs.add("Red");
	     hs.add("White");
	     hs.add("Blue");
	     hs.add("Green");
	     
	     System.out.println(hs);
	     
	     HashSet<String> hs1=new HashSet<>();
	     hs1.add("Black");
	     hs1.add("Red");
	     hs1.add("White");
	     hs1.add("Blue");
	     hs1.add("Green");
	     
	     System.out.println(hs1);
	     
	     System.out.println("compare :"+hs.equals(hs1));

	}

}
