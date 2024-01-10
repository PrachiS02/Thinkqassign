package com.arraylist2;

import java.util.ArrayList;
import java.util.Iterator;

public class FailfastIterator {

	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList();
		a1.add("Kiwi");
        a1.add("Oranges");
        a1.add("Apple");
        a1.add("cherries");
        a1.add("Banana");
        
        System.out.println(a1);
        
        Iterator<String> itr=a1.iterator();
        while(itr.hasNext())
        {
        	if(itr.next().equals("Apple"))
        	{
        		a1.add("guava");
        	}
        }
        System.out.println(a1);

	}

}
