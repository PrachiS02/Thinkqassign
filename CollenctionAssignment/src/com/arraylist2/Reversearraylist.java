package com.arraylist2;

import java.util.ArrayList;
import java.util.Collections;

public class Reversearraylist {

	public static void main(String[] args) {

		ArrayList<Integer> ls=new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		
		System.out.println("before arraylist:"+ls);
		
		Collections.reverse(ls);
		
		System.out.println("after reverse arraylist:"+ls);
		
		
		

	}

}
