package com.comparatorexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeTest
{
	
	public static void findnamebychar(ArrayList<Employee> list,char c)
	{
		for(Employee e:list)
		{
		if(e.getEname().charAt(0)==c ||e.getEname().toLowerCase().charAt(0)==c)
			{
				System.out.println(e);
			}
		}
	}
	
	public static void findhighsal(ArrayList<Employee> list)
	{
		Employee temp=new Employee();
		double highsal=0;
		for(Employee e:list)
		{
			if(e.getEsal()>highsal)
			{
				highsal=e.getEsal();
				temp=e;
			}
		}
		System.out.println("highest salary");
		System.out.println(temp);
	}
	public static void main(String[] args) 
	{
      Department d[]=new Department[3];
      d[0]=new Department(1,"IT","Pune");
      d[1]=new Department(2,"HR","Satara");
      d[2]=new Department(3,"Sales","Mumbai");
      
     
      ArrayList<Employee> emp=new ArrayList<>();
      emp.add(new Employee(101,"Jyoti",45000,d[0]));
      emp.add(new Employee(102,"Reetu",56000,d[1]));
      emp.add(new Employee(103,"Arpita",30000,d[2]));
      emp.add(new Employee(104,"Pranali",78000,d[2]));
      emp.add(new Employee(105,"Pranay",35000,d[1]));
      
      
      //emp.add(new Employee(101,"Reetu",80000,new Department(depid,dname,dloc)));
      
      
       
      Collections.sort(emp);
      for(Employee s:emp)
      {
    	  System.out.println(s);
      }
    
      
      //findhighsal(emp);
      
     
      Scanner sc=new Scanner(System.in);
      
      System.out.println("Enter character");
      char ch=sc.next().charAt(0);
      
      findnamebychar(emp, ch);
      
      
      
      
	}

}
