package com.map;

import java.util.HashMap;
import java.util.Map;

public class MaptoAnother {

	public static void main(String[] args)
	{
		
      HashMap<Integer,String> hm1=new HashMap<Integer,String>();
      hm1.put(101, "Ravi");
      hm1.put(102, "Rahul");
      hm1.put(103, "Reetu");
      
      HashMap<Integer,String> hm2=new HashMap<Integer,String>();
      
      hm2.put(101, "Ravi");
      hm2.put(102, "Rahul");
      hm2.put(103, "Reetu");
      
      HashMap<Integer,String> hm3=new HashMap<Integer,String>();
      
      hm3.put(101, "Ravi");
      hm3.put(102, "Rahul");
      hm3.put(103, "Reetu");
      
      
      HashMap<Integer,HashMap<Integer,String>> hm=new HashMap<>();
      hm.put(1, hm1);
      hm.put(2, hm2);
      hm.put(3, hm3);
      
      System.out.println(hm);
      
      for(Map.Entry<Integer,HashMap<Integer,String>>en: hm.entrySet())
      {
    	  System.out.println(en.getKey()+"-->"+en.getValue());
      }
      

	}

}
