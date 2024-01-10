package com.linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedList {

	public static void main(String[] args) 
	{
       LinkedList<String> ls=new LinkedList<>();
       ls.add("Prachi");
       ls.add("Reetu");
       ls.add("Pranay");
       ls.add("Pranali");
       
       Iterator<String> itr=ls.iterator();
       
       while(itr.hasNext())
       {
       	System.out.println(itr.next());
       }
       
       //ListIterator<String> litr= ls
	}

}
