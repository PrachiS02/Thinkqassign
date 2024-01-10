package com.Masterassignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<>();
	     hs.add(8);
	     hs.add(2);
	     hs.add(9);
	     hs.add(4);
	     hs.add(5);
	     
	    
	     
	    ArrayList<Integer> ls=new ArrayList<Integer>(hs);
	    Collections.sort(ls);
	    
	    System.out.println(ls);
	    		
	}

}
