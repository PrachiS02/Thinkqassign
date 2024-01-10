package com.linkedlistassignment;

import java.util.LinkedList;

public class ReplaceElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> flower=new LinkedList<String>();
		

		flower.add("rose");
		flower.add("daisy");
		flower.add("jasmin");
		flower.add("marigold");
		
		System.out.println("Linked List:"+flower);
		
		flower.set(2, "Mogra");
		System.out.println(flower);
	}

}
