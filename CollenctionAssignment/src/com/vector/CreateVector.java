package com.vector;

import java.util.Vector;

public class CreateVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> lang=new Vector<>(5,2);
	       
	       lang.add("C");
	       lang.add("java");
	       lang.add("python");
	       lang.add("sql");
	       lang.add(".net");
	       System.out.println(lang);
	}

}
