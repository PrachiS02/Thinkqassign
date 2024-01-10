package com.linkedlistassignment;

import java.util.Iterator;
import java.util.LinkedList;

public class Iterateall {

	public static void main(String[] args)
	{

		 LinkedList<Integer> ls=new LinkedList<>();
	      ls.add(1);
	      ls.add(2);
	      ls.add(3);
	      ls.add(4);
	      
	      Iterator<Integer> ir=ls.iterator();
	      
	      while(ir.hasNext())
	      {
	    	  System.out.println(ir.next());
	      }
	      

	}

}
