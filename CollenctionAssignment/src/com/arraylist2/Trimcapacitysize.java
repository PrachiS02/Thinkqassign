package com.arraylist2;

import java.util.ArrayList;

public class Trimcapacitysize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ls=new ArrayList<>(10);
		ls.add(1);
		ls.add(5);
		ls.add(3);
		ls.add(4);
		
		ls.trimToSize();
		
		System.out.println(ls.size());
	}

}
