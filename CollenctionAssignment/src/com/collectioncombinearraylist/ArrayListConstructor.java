package com.collectioncombinearraylist;

import java.util.ArrayList;

public class ArrayListConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Integer> al=new ArrayList<>();
       al.add(1);
       al.add(2);
       al.add(3);
       al.add(4);
       
       System.out.println(al);
       al.add(2, 8);
       al.set(4, 90);
       System.out.println(al);
	}

}
