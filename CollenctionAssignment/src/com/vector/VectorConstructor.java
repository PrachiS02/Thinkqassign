package com.vector;

import java.util.Vector;

public class VectorConstructor {

	public static void main(String[] args) {

		Vector<String> lang=new Vector<>();
	       lang.add("C");
	       lang.add("java");
	       lang.add("python");
	       lang.add("sql");
	       lang.add(".net");
	       
	       System.out.println(lang);
	       
	       lang.insertElementAt("c++", 0);
	       lang.addAll(1, lang);
	       lang.add(3, "React");
	      
	}

}
