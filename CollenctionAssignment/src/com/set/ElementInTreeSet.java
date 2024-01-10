package com.set;

import java.util.TreeSet;

public class ElementInTreeSet {

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
        
        System.out.println("Element in TreeSet:"+ts.size());
	}

}
