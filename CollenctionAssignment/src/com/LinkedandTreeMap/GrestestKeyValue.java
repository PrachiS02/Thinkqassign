package com.LinkedandTreeMap;

import java.util.Collections;
import java.util.TreeMap;

public class GrestestKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>tmp=new TreeMap<>();
	       tmp.put(1, "a");
	       tmp.put(23, "b");
	       tmp.put(19, "c");
	       tmp.put(4, "d");
	       
	      System.out.println(tmp);
	      System.out.println("greatest key value pair:"+tmp.floorEntry(9));
	      
	}

}
