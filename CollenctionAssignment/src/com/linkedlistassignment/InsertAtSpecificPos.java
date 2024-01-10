package com.linkedlistassignment;

import java.util.Iterator;
import java.util.LinkedList;

public class InsertAtSpecificPos {

	public static void main(String[] args) 
	{
		 LinkedList<Integer> ls=new LinkedList<>();
	      ls.add(1);
	      ls.add(2);
	      ls.add(3);
	      ls.add(4);
	      
//	      System.out.println(ls);
	      Iterator<Integer> itr=ls.iterator();
	      while(itr.hasNext())
	      {
	    	  System.out.println(itr.next());
	      }
	      

	}

}
