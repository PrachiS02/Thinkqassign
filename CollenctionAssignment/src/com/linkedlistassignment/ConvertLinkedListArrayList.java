package com.linkedlistassignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> flower = new LinkedList<String>();

		flower.add("rose");
		flower.add("daisy");
		flower.add("jasmin");
		flower.add("marigold");

		System.out.println("Linked List:" + flower);

		ArrayList<String> alist = new ArrayList<String>();

		alist.addAll(flower);

		System.out.println("ArrayList:" + alist);
	}

}
