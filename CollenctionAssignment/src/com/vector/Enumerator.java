package com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<String> lang=new Vector<>();
	       lang.add("C");
	       lang.add("java");
	       lang.add("python");
	       lang.add("sql");
	       lang.add(".net");
	       
	       //System.out.println(lang);
	       
	       Enumeration<String> en=lang.elements();
	       while(en.hasMoreElements())
	       {
	    	   System.out.println(en.nextElement());
	       }
	}

}
