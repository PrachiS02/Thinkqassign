package com.set;

import java.util.TreeSet;

public class FindNumGreaterThan7 {

	public static void main(String[] args) {
	
		TreeSet<Integer> ts1=new TreeSet<>();
        ts1.add(1);
        ts1.add(22);
        ts1.add(45);
        ts1.add(10);
        ts1.add(4);
        ts1.add(7);
        
       System.out.println(ts1);
       
       TreeSet<Integer>ts2=new TreeSet<>(ts1);
       ts2=(TreeSet<Integer>) ts1.tailSet(7);
       
        System.out.println(ts2);
	}

}
