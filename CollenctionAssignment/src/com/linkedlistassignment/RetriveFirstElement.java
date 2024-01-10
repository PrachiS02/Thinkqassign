package com.linkedlistassignment;

import java.util.LinkedList;

public class RetriveFirstElement {

	public static void main(String[] args) {
       LinkedList<String> color=new LinkedList<String>();
		
		color.add("Red");
		color.add("pink");
		color.add("White");
		color.add("yellow");
		color.add("blue");

		System.out.println(color);

		System.out.println("First element :"+color.getFirst());
		
		System.out.println("Last element :"+color.getLast());

	}

}
