package com.arraylist2;

import java.util.ArrayList;

public class Increasesizeofarraylist {

	public static void main(String[] args) 
	{
		ArrayList<Integer> ls=new ArrayList<>(10);
		ls.add(1);
		ls.add(5);
		ls.add(3);
		ls.add(4);
		
		System.out.println("size:"+ls.size());
		
		//ls.trimToSize();
		ls.ensureCapacity(2);
		ls.add(8);
	    ls.add(9);
		System.out.println(ls);
		

	}

}
