package com.set;

import java.util.HashSet;

public class RetainFromTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
	     hs.add("Black");
	     hs.add("Red");
	     hs.add("White");
	     hs.add("Pink");
	     hs.add("Gray");
	     
	     
	     System.out.println(hs);
	     
	     HashSet<String> hs1=new HashSet<>();
	     hs1.add("Black");
	     hs1.add("Red");
	     hs1.add("White");
	     hs1.add("Blue");
	     hs1.add("Green");
	     
	     System.out.println(hs1);
	     
	    
	    hs.retainAll(hs1);
	    System.out.println(hs);
	    
	}

}
