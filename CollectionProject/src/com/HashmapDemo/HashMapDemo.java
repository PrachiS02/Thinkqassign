package com.HashmapDemo;

import java.util.HashMap;

public class HashMapDemo
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<String,String> hmap=new HashMap<>();
       hmap.put("India", "+91");
       hmap.put("USA", "+1");
       hmap.put("UAE", "+971");
       hmap.put("Germany", "+49");
       //put()- return null if the key is not present
       hmap.put(null,"+0");
       // put() -return the old value of the key and replaces with new value
       System.out.println(hmap.put("south Korea","+100"));
       hmap.put("Italy",null);
       
         
       System.out.println(hmap);
       
       System.out.println("size:"+hmap.size());
       
       //get 
       System.out.println("---------------");
       System.out.println(hmap.get("USA"));
       
       System.out.println(hmap.containsKey("Spain"));
       System.out.println(hmap.containsValue("+49"));
       
       System.out.println("----------------------------");
       
       //Putif Absent value null
       // it returns null if the old value is null and replaced by new value
       // return same value if it is null
       
       System.out.println(hmap.putIfAbsent("Italy", "+2"));
       //System.out.println(hmap.pu);
       
       
       
       

}
}