package com.Masterassignment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateArryalist {

	public static void main(String[] args) {
	
		 ArrayList<String> al = new ArrayList<String>(); 
		 al.add("Sun"); 
		 al.add("Mon"); 
		 al.add("Sat"); 
		 al.add("Sun "); 
		 al.add("Mon "); 
		 al.add("Sat "); 
		 al.add("Sun "); 
		 al.add("Sat "); 
		 al.add("Sun "); 
		 al.add("Mon ");
		 
		 System.out.println(al);
		 Set<String> s=new LinkedHashSet<>(al);
		 ArrayList<String> rd=new ArrayList(s);
		 System.out.println(rd);
		 
		
	}

}
