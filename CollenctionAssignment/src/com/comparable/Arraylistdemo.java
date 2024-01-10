package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ls=new ArrayList<>();
		ls.add(1);
		ls.add(4);
		ls.add(8);
		ls.add(3);
		
		System.out.println(ls);
		System.out.println("after sorting:");
		Collections.sort(ls);
	    System.out.println(ls);
	

	}

}
