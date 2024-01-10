package com.linkedlistassignment;

import java.util.LinkedList;

public class FirstLast {

	public static void main(String[] args) 
	{
		 LinkedList<Integer> ls=new LinkedList<>();
	      ls.add(1);
	      ls.add(2);
	      ls.add(3);
	      ls.add(4);
	      
	      System.out.println(ls);
	      ls.addFirst(8);
	      ls.addLast(11);
	      System.out.println(ls);

	}

}
