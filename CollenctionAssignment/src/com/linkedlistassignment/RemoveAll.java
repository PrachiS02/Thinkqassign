package com.linkedlistassignment;

import java.util.LinkedList;

public class RemoveAll {

	public static void main(String[] args)
	{
		LinkedList<Integer> ls=new LinkedList<>();
	      ls.add(1);
	      ls.add(2);
	      ls.add(3);
	      ls.add(4);
	      System.out.println(ls);
	      ls.removeAll(ls);
	      System.out.println(ls);
	      

	}

}
