package com.linkedlistassignment;

import java.util.ArrayList;

public class CloneList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		Object num3=num1.clone();
		
		System.out.println(num3);
	}

}
