package com.LinkedandTreeMap;

import java.util.TreeMap;

public class GreatestLestKeyTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tmp=new TreeMap<>();
	       tmp.put(1, "a");
	       tmp.put(2, "b");
	       tmp.put(3, "c");
	       tmp.put(4, "d");
	       
	      System.out.println(tmp);
	      System.out.println("Greatest Key:"+tmp.lastEntry());
	      System.out.println("least key:"+tmp.firstEntry());
	}

}
