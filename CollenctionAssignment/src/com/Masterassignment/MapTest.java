package com.Masterassignment;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap obj = new HashMap(); 
		obj.put("A", new Integer(1)); 
		obj.put("B", new Integer(2)); 
		obj.put("A", new Integer(4)); 
		obj.put("C", new Integer(3)); 
		System.out.println(obj); // Justify 
	}

}
