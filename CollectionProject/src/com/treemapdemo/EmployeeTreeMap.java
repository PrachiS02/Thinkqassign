package com.treemapdemo;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeTreeMap {

	public static void main(String[] args) 
	{
	
       TreeMap<Employee,String> tmap=new TreeMap<>(new IdComparator());
       tmap.put(new Employee(101,"pranali",23000),"IT");
       tmap.put(new Employee(102,"pranay",89000),"Sales");
       tmap.put(new Employee(103,"prachi",45000),"HR");
       tmap.put(new Employee(104,"pranali",66000),"IT");
       tmap.put(new Employee(105,"pranali",57000),"HR");
       
       for(Map.Entry<Employee, String>e:tmap.entrySet())
       {
    	   System.out.println(e.getKey()+"-->"+e.getValue());
       }
       
       tmap.put(new Employee(106,"pranali",57000), "IT");
		
		System.out.println("-------------------------------------");
		
		for(Map.Entry<Employee, String>e:tmap.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
		}
       
       
	}

}
