package com.linkedlistassignment;

import java.util.ArrayList;

public class JoinLinkedList {

	public static void main(String[] args) {

		ArrayList<Integer> num1 = new ArrayList<>();

		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(5);

		ArrayList<Integer> num2 = new ArrayList<>();

		num2.add(6);
		num2.add(7);
		num2.add(8);
		num2.add(9);
		num2.add(10);
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1.addAll(num2);
		
		System.out.println(num1);
	}

}
