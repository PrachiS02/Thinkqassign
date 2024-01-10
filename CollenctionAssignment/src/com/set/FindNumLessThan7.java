package com.set;

import java.util.TreeSet;

public class FindNumLessThan7 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> ts1=new TreeSet<>();
        ts1.add(1);
        ts1.add(2);
        ts1.add(10);
        ts1.add(4);
        ts1.add(7);
        
       System.out.println(ts1);
       
       TreeSet<Integer>ts2=new TreeSet<>(ts1);
       ts2=(TreeSet<Integer>) ts1.headSet(7);
       
           System.out.println(ts2);
       
	}

}
