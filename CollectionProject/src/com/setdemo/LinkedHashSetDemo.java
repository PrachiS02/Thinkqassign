package com.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		 LinkedHashSet<String> hs=new LinkedHashSet<>();
	       hs.add("fruits");
	       hs.add("Chocolates");
	       hs.add("juice");
	       hs.add("cold drink");
	       hs.add(null);
	       hs.add("juice");
	       
	       System.out.println(hs);
	       
	       System.out.println("--------------------------");
	       for(String s:hs)
	       {
	    	   System.out.println(s);
	       }
	       
	       System.out.println("---------------------");
	       Iterator<String> itr=hs.iterator();
	       while(itr.hasNext())
	       {
	    	   System.out.println(itr.next());
	       }
	       
	}

}
