package com.treemapdemo;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethods {

	public static void main(String[] args) {
    
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
		
		System.out.println("-----------------------");
		
		SortedMap<Integer,String> s1=tmp.subMap(3, 6);//3 included //6 excluded
		System.out.println(s1);
		
		SortedMap<Integer,String> s2=tmp.headMap(3);//entries before 3 and 3 is excluded
		System.out.println(s2);
		
		
		SortedMap<Integer,String> s3=tmp.tailMap(3);//entries after 3 and 3 is included
		System.out.println(s3);
		
		
		//methods navigable map
		
		System.out.println("----------------------------------");
		System.out.println("Lower key:"+tmp.lowerKey(4));//strictly less
		System.out.println("Floor Key:"+tmp.floorKey(4));// less or than equal to
		
		System.out.println("higher key:"+tmp.higherKey(4));//strictly higher
		System.out.println("ceiling key:"+tmp.ceilingKey(4));//equal or greater than
		
		SortedMap<Integer,String> s4=tmp.subMap(3,false,6,true);//3 (from)included :true//6 excluded
		System.out.println(s4);
		
		SortedMap<Integer,String> s5=tmp.headMap(3,true);//by default:entries before 3 and 3
        System.out.println(s5);
        
        SortedMap<Integer,String> s6=tmp.tailMap(3,false);//by default: entries after 3 and 3 is included
		System.out.println(s6);
		
		//by default
		//from :included
		//to excluded
		
		
		
		
		
		
		
		
	}

}
