package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class EmplyoeeTest {

	public static void main(String[] args)
	{

       ArrayList<Employee> e=new ArrayList<>();
       e.add(new Employee(1,"prachi",89000));
       e.add(new Employee(2,"pranay",45000));
       e.add(new Employee(3,"abc",25000));
       e.add(new Employee(4,"pranali",89000));
       
       for(Employee e1:e)
       {
    	   System.out.println(e);
       }
       
       Collections.sort(e,new SalaryComparator());
      
       
	}

}
