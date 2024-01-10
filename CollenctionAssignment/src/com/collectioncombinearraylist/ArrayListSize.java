package com.collectioncombinearraylist;

import java.util.ArrayList;

public class ArrayListSize {

	public static void main(String[] args) {
	ArrayList<Integer> ar=new ArrayList<>();
	ar.add(1);
	ar.add(2);
	ar.add(3);
	ar.add(4);
	System.out.println(ar);
	System.out.println("size:"+ar.size());
	
	
	ar.add(5);
	System.out.println(ar);
	System.out.println("size:"+ar.size());
	

	}

}
