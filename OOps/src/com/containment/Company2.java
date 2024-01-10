package com.containment;

import java.util.Scanner;

public class Company2 
{
    static Scanner sc=new Scanner(System.in);
    
    static void enterDetailsEmployee(Employee e)
    {
    	
     System.out.println("Enter the Employee id:");
   	 e.setEid(sc.nextInt());
   	 
   	 System.out.println("Enter the Employee name:");
   	 e.setEname(sc.next());
   	 
   	 e.setDepartment(new Department());
   	 
   	 System.out.println("enter department id:");
   	 e.getDept().setDid(sc.nextInt());
   	 
   	 System.out.println("enter department name:");
   	 e.getDept().setDname(sc.next());
   	 
    }
	public static void main(String[] args)
	{
	
       Employee e1=new Employee();
       enterDetailsEmployee(e1);
       
       System.out.println(e1);
	}

}
