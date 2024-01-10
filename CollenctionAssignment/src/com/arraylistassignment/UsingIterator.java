package com.arraylistassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {

	public static void main(String[] args) {
     ArrayList<String> ls=new ArrayList<>();
     ls.add("apple");
     ls.add("banana");
     ls.add("pineapple");
     ls.add("saffodila");
     
     //System.out.println(ls);
     
     Iterator<String> itr=ls.iterator();
     
     while(itr.hasNext())
     {
     	System.out.println(itr.next());
     }
     
     

	}

}
