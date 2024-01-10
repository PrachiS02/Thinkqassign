package com.collectioncombinearraylist;

import java.util.ArrayList;
import java.util.Collections;


public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> ar=new ArrayList<>();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(5);
		ar.add(6);
		ar.add(7);
		ar.add(8);
		ar.add(9);
		ar.add(10);
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
	}

}
