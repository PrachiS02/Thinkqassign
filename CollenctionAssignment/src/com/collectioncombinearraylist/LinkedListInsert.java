package com.collectioncombinearraylist;

import java.util.LinkedList;

public class LinkedListInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ar=new LinkedList<>();
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
		ar.add(4, 45);
		System.out.println(ar);
	}

}
