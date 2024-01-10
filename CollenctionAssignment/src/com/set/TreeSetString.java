package com.set;

import java.util.TreeSet;

public class TreeSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TreeSet<String> ts=new TreeSet<>();
         ts.add("Mango");
         ts.add("Apple");
         ts.add("Cheery");
         ts.add("Lemon");
         
         for(String s:ts)
         {
        	 System.out.println(s);
         }
         
	}

}
