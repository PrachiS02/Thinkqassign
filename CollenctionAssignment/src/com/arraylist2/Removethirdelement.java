package com.arraylist2;

import java.util.ArrayList;

public class Removethirdelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ls=new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		
		System.out.println(ls);
		int removeind=2;
		ls.remove(removeind);
		System.out.println(ls);
	}

}
