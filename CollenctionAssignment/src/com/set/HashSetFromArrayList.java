package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

public class HashSetFromArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	
	//System.out.println(al);
	
	HashSet<Integer> hs= new HashSet<Integer>(al);
	System.out.println(hs);
	

	}

}
