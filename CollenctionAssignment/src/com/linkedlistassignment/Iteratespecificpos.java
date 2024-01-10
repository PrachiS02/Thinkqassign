package com.linkedlistassignment;

import java.util.Iterator;
import java.util.LinkedList;

public class Iteratespecificpos {

	public static void main(String[] args) {
     
		 LinkedList<Integer> ls=new LinkedList<>();
	      ls.add(1);
	      ls.add(2);
	      ls.add(3);
	      ls.add(4);
	      
	      
          Iterator<Integer> ir=ls.listIterator(1);
	      
	      while(ir.hasNext())
	      {
	    	  System.out.println(ir.next());
	      }
	      

	}

}
