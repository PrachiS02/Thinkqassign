package com.LinkedandTreeMap;

import java.util.TreeMap;

public class GetGreatestKey {

	public static void main(String[] args) {
		
	      TreeMap<Integer,String>tmp=new TreeMap<>();
	       tmp.put(1, "a");
	       tmp.put(23, "b");
	       tmp.put(19, "c");
	       tmp.put(4, "d");
	       
	      System.out.println(tmp);
	      System.out.println("Greatest key:"+tmp.floorKey(20));
	}

}
