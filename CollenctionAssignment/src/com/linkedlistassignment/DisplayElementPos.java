package com.linkedlistassignment;

import java.util.LinkedList;

public class DisplayElementPos {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(23);
		list.add(56);
		list.add(21);
		list.add(98);
		list.add(56);
		list.add(77);
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+" -->"+list.get(i));
		}

	}

}
