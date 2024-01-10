package com.set;

import java.util.HashSet;

public class RemoveAll {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<>();
	     hs.add("Black");
	     hs.add("Red");
	     hs.add("White");
	     hs.add("Blue");
	     hs.add("Green");
	
	     System.out.println(hs);
	     
	     
	    hs.removeAll(hs);
	    System.out.println(hs);
	}

}
