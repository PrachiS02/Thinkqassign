package com.setdemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		
       HashSet<String> hs=new HashSet<>();
       hs.add("fruits");
       hs.add("Chocolates");
       hs.add("juice");
       hs.add("cold drink");
       hs.add(null);
       hs.add("juice");
       
       System.out.println(hs);
       
       HashSet<String> hs1=new HashSet<>();
       hs1.add("juice");
       hs1.add("chips");
       hs1.add("cheese");
       
       System.out.println(hs1);
       
       //union
      // hs.addAll(hs1);
      // System.out.println(hs);
       
       //diffrence
       hs.removeAll(hs1);
       System.out.println(hs);
       
       //intersection
       
       
       for(String s:hs)
       {
    	   System.out.println(s);
       }
       
       System.out.println("---------------------------------");
       
      Iterator<String> itr=hs.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
       
      System.out.println(hs.contains("chips"));
      

}
}
