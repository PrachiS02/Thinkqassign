package com.vector;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	
       Vector<String> lang=new Vector<>(5,2);
       
       lang.add("C");
       lang.add("java");
       lang.add("python");
       lang.add("sql");
       lang.add(".net");
       
       System.out.println(lang.capacity());
       System.out.println(lang.size());
       
       lang.add("Angular");
       
       System.out.println("------------------");
       
       System.out.println(lang.capacity());
       System.out.println(lang.size());
       
       System.out.println("--------------------");
       System.out.println(lang.get(2));
       System.out.println(lang.elementAt(2));
       
       System.out.println("--------------------");
       
       
       
       
       
       
       
       
       
	}

}
