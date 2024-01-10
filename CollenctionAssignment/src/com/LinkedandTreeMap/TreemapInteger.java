package com.LinkedandTreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreemapInteger {

	public static void main(String[] args) {
	
       TreeMap<Integer,Integer>tmp=new TreeMap<>();
       tmp.put(1, 1);
       tmp.put(2, 2);
       tmp.put(3, 3);
       tmp.put(4, 4);
       
       for(Map.Entry<Integer, Integer> e:tmp.entrySet())
       {
    	   System.out.println(e.getKey()+"->"+e.getValue());
       }
       
	}

}
