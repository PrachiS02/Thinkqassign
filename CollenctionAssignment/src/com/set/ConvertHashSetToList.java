package com.set;

import java.util.ArrayList;
import java.util.HashSet;

public class ConvertHashSetToList {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
	     hs.add("Black");
	     hs.add("Red");
	     hs.add("White");
	     hs.add("Blue");
	     hs.add("Green");
	     
	     System.out.println(hs);
	     
	     System.out.println("Converted in Arraylist");
	     ArrayList<String> al=new ArrayList<>(hs);
	     System.out.println(al);
	}
}
