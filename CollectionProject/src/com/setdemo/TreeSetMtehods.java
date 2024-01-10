package com.setdemo;

import java.util.TreeSet;

public class TreeSetMtehods {

	public static void main(String[] args) {

       TreeSet<Integer> ts=new TreeSet<>();
       ts.add(89);
       ts.add(11);
       ts.add(78);
       ts.add(54);
       ts.add(23);
       ts.add(66);
       
       //ts.add(null);
       //duplicate not allowed
       
       //sortedset
       System.out.println(ts);
       System.out.println("first:"+ts.first());
       System.out.println("last:"+ts.last());
       
       System.out.println(ts.headSet(66));// 66 is not included
       System.out.println(ts.tailSet(66));// is included
       System.out.println(ts.subSet(11, 23));// 11 included and 23 not
       
       //NavigableSet
       System.out.println("Lower:"+ts.lower(66));//strictly lower
       System.out.println("floor:"+ts.floor(66));// equal or lower
       
       System.out.println("higher:"+ts.higher(66));
       System.out.println("ceiling:"+ts.ceiling(66));
       
       System.out.println(ts.headSet(66,true));
       System.out.println(ts.tailSet(66,false));
       System.out.println(ts.subSet(11,true,23,true));
       
	}

}
