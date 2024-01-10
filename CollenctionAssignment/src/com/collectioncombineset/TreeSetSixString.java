package com.collectioncombineset;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetSixString
{
   private static int indexOf(TreeSet<String> ts,String s)
   {
	   List<String> ls=new ArrayList<String>(ts);
	   return ls.indexOf(s);
   }
	public static void main(String[] args) {
		
		TreeSet<String> hs=new TreeSet<>();
        hs.add("apple");
        hs.add("guava");
        hs.add("cherry");
        hs.add("pineapple");
        hs.add("mango");
        
        System.out.println(hs);
        
        System.out.println("Element at index:"+indexOf(hs, "cherry"));
       
	}

	
	

}
