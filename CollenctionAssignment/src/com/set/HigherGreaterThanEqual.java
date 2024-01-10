package com.set;

import java.util.TreeSet;

public class HigherGreaterThanEqual {

	public static void main(String[] args) {

		TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(15);
        ts.add(4);
        
       System.out.println(ts);
       System.out.println("Striclty higher:"+ts.ceiling(11));
	}

}
