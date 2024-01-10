package com.collectioncombineset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<>();
        hs.add("apple");
        hs.add("guava");
        hs.add("cherry");
        hs.add("pineapple");
        hs.add("mango");
        hs.add("lemon");
        hs.add("peach");
        hs.add("berry");
        hs.add("banana");
        hs.add("orange");

        for(String s:hs)
        {
        	System.out.println(s);
        }
        System.out.println("======================================================");
        Iterator<String> itr=hs.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
	} 

}
