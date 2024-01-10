package com.arraylistassignment;

import java.util.ArrayList;

public class Replaceanother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<String> al=new ArrayList<>();
		 
		 al.add("pune");
		 al.add("satara");
		 al.add("solapur");
		 al.add("sangali");
		
		 System.out.println("before replae:"+al);
		 
		 al.set(1, "latur");
		 System.out.println("after replaace:"+al);
	}

}
