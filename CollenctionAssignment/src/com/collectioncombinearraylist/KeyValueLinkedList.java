package com.collectioncombinearraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class KeyValueLinkedList {

	public static void main(String[] args) {

        ArrayList<Integer> key1=new ArrayList<>();
        key1.add(1);
        key1.add(2);
        key1.add(3);
        key1.add(4);
        

        ArrayList<String> value1=new ArrayList<>();
        value1.add("A");
        value1.add("B");
        value1.add("C");
        value1.add("D");
        
        HashMap<ArrayList<Integer>,ArrayList<String>> hm=new HashMap<>();
        hm.put(key1, value1);
        
        Iterator<ArrayList<Integer>> itr=hm.keySet().iterator();
        while(itr.hasNext())
        {
        	ArrayList<Integer> k=itr.next();
        	System.out.println(k+":"+hm.get(k));
        }
         
        
	}

}
