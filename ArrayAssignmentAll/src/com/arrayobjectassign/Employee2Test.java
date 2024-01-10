package com.arrayobjectassign;

public class Employee2Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
    Department2 d[]=new Department2[3];
    d[0]=new Department2(1,"IT");
    d[1]=new Department2(2,"Sales");
    d[2]=new Department2(3,"HR");
    
    Employee2 e[]=new Employee2[3];
    e[0]=new Employee2(101,"Aniket",d[0]);
    e[1]=new Employee2(102,"Anjali",d[1]);
    e[2]=new Employee2(103,"Akshay",d[2]);
    
    
    for(Employee2 x:e)
    {
    	System.out.println(x);
    }
    
    
   
    
	}

}
