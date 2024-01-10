package com.set;

import java.util.TreeSet;

public class CompareTwoTreeSets {

	public static void main(String[] args) {
		TreeSet<Integer> ts1=new TreeSet<>();
        ts1.add(1);
        ts1.add(2);
        ts1.add(3);
        ts1.add(4);
        
       System.out.println(ts1);
       
       TreeSet<Integer> ts2=new TreeSet<>();
       ts2.add(1);
       ts2.add(2);
       ts2.add(3);
       ts2.add(4);
       
      System.out.println(ts2);
      
      System.out.println("Compare two tree sets:"+ts1.equals(ts2));
      
      
      

	}

}
