package com.arraylistassignment;

import java.util.ArrayList;

public class Insertatfirstposition {

	public static void main(String[] args)
	{
		 ArrayList<String> a1=new ArrayList();
	        a1.add("Kiwi");
	        a1.add("Oranges");
	        a1.add("Apple");
	        a1.add("cherries");
	        a1.add("Banana");
	        
	        System.out.println(a1);
	        
	        a1.add(1, "guava");
	        
	        System.out.println(a1);

	}

}
