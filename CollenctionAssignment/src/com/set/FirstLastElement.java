package com.set;

import java.util.TreeSet;

public class FirstLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
        ts.add("Mango");
        ts.add("Apple");
        ts.add("Cheery");
        ts.add("Lemon");
        
        for(String s:ts)
        {
       	 System.out.println(s);
        }
        
        System.out.println("First Element:"+ts.first());
        System.out.println("Last Element:"+ts.last());
	}

}
