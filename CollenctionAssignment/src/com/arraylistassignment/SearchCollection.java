package com.arraylistassignment;

import java.util.ArrayList;

public class SearchCollection {

	public static void main(String[] args) 
	{

		 ArrayList<String> al=new ArrayList<>();
		 
		 al.add("pune");
		 al.add("satara");
		 al.add("solapur");
		 al.add("sangali");
		 
		 ArrayList<String> al1=new ArrayList<>();
		 al1.add("satara");
		 al1.add("pune");
		 
		 boolean search=al.containsAll(al1);
		 
		 if(search)
		 {
			 System.out.println("collection is present");
		 }
		 else
		 {
			 System.out.println("collection is not present");
		 }
		 
		 

	}

}
