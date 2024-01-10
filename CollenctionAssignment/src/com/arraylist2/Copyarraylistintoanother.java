package com.arraylist2;

import java.util.ArrayList;

public class Copyarraylistintoanother {

	public static void main(String[] args)
	{

		ArrayList<Integer> ls=new ArrayList<>();
		
		ls.add(1);
		ls.add(5);
		ls.add(3);
		ls.add(4);
		
		System.out.println("before copy array:"+ls);
		ArrayList<Integer> ls1=new ArrayList<>();
		ls1.addAll(ls);
		System.out.println("after copy array:"+ls1);

	}

}
