package com.set;

import java.util.TreeSet;

public class HigherElementRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        
       System.out.println(ts);
        
        System.out.println("Highest element:"+ts.pollLast());
        System.out.println("Strictly higher:"+ts.higher(2));
        System.out.println("Striclty higher:"+ts.ceiling(4));
	}

}
