package com.collectioncombinemap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lmap=new LinkedHashMap<>();
		lmap.put("abhay", 98);
		lmap.put("raj", 56);
		lmap.put("rani", 23);
		lmap.put("mansi", 89);
		
		for(Map.Entry<String, Integer> e:lmap.entrySet())
		{
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
	}

}
