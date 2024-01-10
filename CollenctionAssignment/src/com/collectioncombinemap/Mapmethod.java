package com.collectioncombinemap;

import java.util.HashMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Mapmethod {

	public static void main(String[] args) 
	{
	 
	       TreeMap<Integer,String> tmp=new TreeMap<>();
			tmp.put(1, "angular");
			tmp.put(2, "java");
			tmp.put(5, "HTML");
			tmp.put(6, "C++");
			tmp.put(3, "python");
			
			System.out.println(tmp);
			//methods
			//sorted map
			
			System.out.println("First key:"+tmp.firstKey());
			System.out.println("last key:"+tmp.lastKey());
			SortedMap<Integer,String> s1=tmp.subMap(3, 6);//3 included //6 excluded
			System.out.println(s1);
			
			SortedMap<Integer,String> s2=tmp.headMap(3);//entries before 3 and 3 is excluded
			System.out.println(s2);
			
			
			SortedMap<Integer,String> s3=tmp.tailMap(3);//entries after 3 and 3 is included
			System.out.println(s3);

	}

}
