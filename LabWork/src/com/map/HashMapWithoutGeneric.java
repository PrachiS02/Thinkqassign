package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapWithoutGeneric 
{
    public static void searchElement(HashMap<Integer,String>hm1,int key)
    {
    	boolean found=false;
    	for(Map.Entry<Integer, String>en:hm1.entrySet())
    	{
    		if(en.getKey()==key)
    		{
    			found=true;
    			System.out.println("element found");
    			System.out.println(en.getValue());
    			break;
    			
    		}
    		else
    		{
    			found =false;
    		}
    	}
    	if(found==false)
    	{
    		System.out.println("element is not found");
    	}
    }
	public static void main(String[] args) {
        HashMap hm1=new HashMap();
        hm1.put(1,"prachi");
        hm1.put(2,"arpita");
        hm1.put(3,"reetu");
        hm1.put(4,"sakshi");
        
        System.out.println(hm1);
        
        HashMap hm2=new HashMap();
        hm2.put("prachi",101);
        hm2.put("arpita",102);
        hm2.put("reetu",103);
        hm2.put("sakshi",104);
        
        System.out.println(hm2);
        
        	System.out.println("-------------------------");
        //5.copy to another map
        HashMap newMap=new HashMap();
        newMap.putAll(hm1);
        System.out.println("copy to another map:"+newMap);
        
        System.out.println("-----------------------");
        //6.search the element from hashmap
        
        System.out.println("search element using key:");
       
        System.out.println(hm1.get(1));
	
        //7.test if hashmap contains  a mapping for specific value
        System.out.println("---------------------------");
        
        boolean b=hm1.containsValue("arpita");
        System.out.println("contain specified value:"+b);
        
        System.out.println("-------------------------");
        
        //7.remove element from hashmap using key
        
        hm1.remove(2);
        System.out.println("remove elemnt");
        System.out.println(hm1);
        
        System.out.println("-------------------------------");
        
        //9.to empty map
        
        Iterator<Map.Entry<Integer,String>> itr=hm1.entrySet().iterator();
        
        while(itr.hasNext())
        {
        	Map.Entry<Integer,String> entry=itr.next();
        	itr.remove();
        }
        System.out.println(hm1);
        
        System.out.println("----------------------------------------");
        searchElement(hm1, 3);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
}
