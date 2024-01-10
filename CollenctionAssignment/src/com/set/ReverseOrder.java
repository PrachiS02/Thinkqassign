package com.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
        ts.add("Mango");
        ts.add("Apple");
        ts.add("Cheery");
        ts.add("Lemon");
        
        System.out.println("original treeset:"+ts);
        
      Iterator<String> itr=ts.descendingIterator();
      System.out.println("reverse order:");
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
	}

}
