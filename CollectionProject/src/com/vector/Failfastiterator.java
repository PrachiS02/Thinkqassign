package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Failfastiterator {

	public static void main(String[] args) 
	{

     Vector<Integer> ls=new Vector<>();
     ls.add(1);
     ls.add(56);
     ls.add(45);
     ls.add(67);
     
      System.out.println(ls.capacity());
      System.out.println(ls.size());
     
     Enumeration<Integer> en=ls.elements();
     while(en.hasMoreElements())
     {
    	if(en.equals(ls))
    	{
    		ls.add(2);
    	}
    	 
     }
     
     System.out.println(ls);
     
     
     
     
	}

}
