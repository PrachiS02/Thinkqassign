package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo2 {

	public static void main(String[] args) {
     
		ArrayList<String> ls=new ArrayList<>();
		ls.add("java");
		ls.add("python");
		ls.add("SQL");
		ls.add("HTML");
		
		System.out.println(ls);
		System.out.println("after sorting:");
		Collections.sort(ls);
	    System.out.println(ls);
	

	}

}
