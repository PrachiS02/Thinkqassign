package com.collectioncombineset;

import java.util.HashSet;

public class CreateHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(1);
        hs.add(3);
        
        System.out.println(hs);
        
        HashSet<Integer> hs1=new HashSet<>(4);
        hs1.add(10);
        hs1.add(1);
        hs1.add(3);
        hs1.add(5);
        System.out.println(hs1);
        
        HashSet<Integer> hs2=new HashSet<>(hs1);
        System.out.println("passing collection:"+hs2);
        
        
	}

}
