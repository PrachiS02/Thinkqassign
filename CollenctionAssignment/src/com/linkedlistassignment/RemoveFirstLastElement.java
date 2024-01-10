package com.linkedlistassignment;

import java.util.LinkedList;

public class RemoveFirstLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ls=new LinkedList<>();
	      ls.add(1);
	      ls.add(2);
	      ls.add(3);
	      ls.add(4);
	      System.out.println(ls);
	      ls.removeFirst();
	      ls.removeLast();
	      System.out.println(ls);
	}

}
