package com.Masterassignment;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<Employee2,String> hs=new HashMap<>();
      hs.put(new Employee2(1,"Reetu",90000),"IT");
      hs.put(new Employee2(2,"Riya",34000),"IT");
      hs.put(new Employee2(3,"Reetu",90000),"IT");
      hs.put(new Employee2(4,"Raj",67000),"IT");
      
      for(Map.Entry<Employee2, String> en:hs.entrySet())
      {
    	  System.out.println(en.getKey()+"->"+en.getValue());
    	  
      }
      
	}

}
