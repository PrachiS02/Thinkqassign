package com.linkedlistassignment;

import java.util.LinkedList;

public class CheclListEmepty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> color = new LinkedList<String>();

		System.out.println("List is Empty:"+color.isEmpty()+" "+color);
		color.add("Red");
		color.add("pink");
		color.add("White");
		color.add("yellow");
		color.add("blue");

		System.out.println(color);
		
		System.out.println("List is Empty:"+color.isEmpty());

	}
	}


