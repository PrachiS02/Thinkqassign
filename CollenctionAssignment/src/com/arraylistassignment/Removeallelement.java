package com.arraylistassignment;

import java.util.ArrayList;

public class Removeallelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> ls=new ArrayList<>();
      ls.add("mango");
      ls.add("apple");
      ls.add("guava");
      ls.add("lemon");
      
      ls.removeAll(ls);
      
      System.out.println(ls);
      
      
      
	}

}
