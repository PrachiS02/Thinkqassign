package com.LinkedandTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class CopyTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String>tmp=new TreeMap<>();
	       tmp.put("A", "a");
	       tmp.put("B", "b");
	       tmp.put("C", "c");
	       tmp.put("D", "d");
	       
	      System.out.println(tmp);
	       TreeMap<String,String>tmp1=new TreeMap<>();
	       tmp1.putAll(tmp);
	       System.out.println(tmp1);
	       
	}

}
