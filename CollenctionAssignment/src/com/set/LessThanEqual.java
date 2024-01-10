package com.set;

import java.util.TreeSet;

public class LessThanEqual {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(5);
        ts.add(4);
        
       System.out.println(ts);
       System.out.println("less than equal:"+ts.floor(3));

	}

}
