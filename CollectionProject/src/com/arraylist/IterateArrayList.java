package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArrayList {

	public static void main(String[] args)
	{

        ArrayList<String> a1=new ArrayList(5);
        a1.add("Kiwi");
        a1.add("Oranges");
        a1.add("Apple");
        a1.add("cherries");
        a1.add("Banana");
        
        System.out.println(a1);
        
        System.out.println("---------------");
        
        for( int i=0;i<a1.size();i++)
        {
        	System.out.println(a1.get(i));
        }
        
        System.out.println("--------------");
        
        for(String s:a1)
        {
        	System.out.println(s);
        }
        
        System.out.println("---------------");
        
        Iterator<String> itr=a1.iterator();
        
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        System.out.println("-----------------");
        
        ListIterator<String> litr=a1.listIterator();
        
        while(litr.hasNext())
        {
        	System.out.println(litr.next());
        }
        
       ListIterator<String> litr1=a1.listIterator(a1.size());
        
        while(litr1.hasPrevious())
        {
        	System.out.println(litr1.hasPrevious());
        }
	}

}
