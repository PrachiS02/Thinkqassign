package com.collectioncombinearraylist;

import java.util.ArrayList;

public class RetainAllMethod {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
	       al.add(1);
	       al.add(2);
	       al.add(3);
	       al.add(4);
	       
	      
	       al.retainAll(al);
	       System.out.println(al);
	}

}
