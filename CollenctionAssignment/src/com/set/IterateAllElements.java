package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class IterateAllElements {

	public static void main(String[] args) {

       HashSet<Integer> hs =new HashSet<>();
       hs.add(8);
       hs.add(5);
       hs.add(3);
       hs.add(4);
       
      // System.out.println(hs);
       Iterator<Integer> itr=hs.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
	}

}
