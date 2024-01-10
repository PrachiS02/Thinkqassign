package com.arraylistassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterateusingforeach {

	public static void main(String[] args) 
	{
		ArrayList<String> ls=new ArrayList<>();
	      ls.add("prachi");
	      ls.add("pranali");
	      ls.add("pranay");
	      
	     for(String s:ls)
	     {
	    	 System.out.println(s);
	     }

	}

}
