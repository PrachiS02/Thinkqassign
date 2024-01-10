package com.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIteratorAllElements {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
        ts.add("Mango");
        ts.add("Apple");
        ts.add("Cheery");
        ts.add("Lemon");
        
        for(String s:ts)
        {
       	 System.out.println(s);
        }
        
        Iterator<String> itr=ts.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }

	}

}
