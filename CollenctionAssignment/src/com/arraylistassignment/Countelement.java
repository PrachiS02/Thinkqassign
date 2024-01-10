package com.arraylistassignment;

import java.util.ArrayList;

public class Countelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> a1=new ArrayList();
	        a1.add("Kiwi");
	        a1.add("Oranges");
	        a1.add("Apple");
	        a1.add("cherries");
	        a1.add("Banana");
	        
	        System.out.println(a1);
	        
	        System.out.println("element count by size:"+a1.size());
	        int count=0;
	        for(String s:a1)
	        {
	        	count++;
	        }
	        System.out.println("element count by variable:"+count);
	}

}
