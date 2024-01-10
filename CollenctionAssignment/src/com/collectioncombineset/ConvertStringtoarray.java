package com.collectioncombineset;

import java.util.HashSet;

public class ConvertStringtoarray {

	public static void main(String[] args) {

		HashSet<String> hs=new HashSet<>();
        hs.add("apple");
        hs.add("guava");
        hs.add("cherry");
        
        System.out.println(hs);
        String s[]=new String[hs.size()];
        hs.toArray(s);
        for(String e:s)
        {
        	System.out.println(e);
        }
	}

}
