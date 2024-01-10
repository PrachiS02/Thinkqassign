package com.arraylistassignment;

import java.util.ArrayList;
import java.util.Collections;

public class Swaptwoelements {

	public static void main(String[] args) {
     
		ArrayList<String> name=new ArrayList<>();
		
		name.add("Raj");
		name.add("Rutuja");
		name.add("Pranali");
		name.add("Prachi");
		
		System.out.println("Arraylist before swap: "+name);
		
		Collections.swap(name, 0, 1);
		
		System.out.println("Array list after swap:"+name);
		

	}

}
