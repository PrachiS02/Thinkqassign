package com.map1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class EmployeeTest 
{
	public static void sortDepartment(HashMap<Department,ArrayList<Employee>> list)
    {
   	 for(Map.Entry<Department, ArrayList<Employee>> en:list.entrySet())
   	 {
   		   
	        System.out.println(en.getKey());
	        for(Employee e:en.getValue())
	        {
	        	System.out.println(e);
	        }
	        System.out.println("-------------------------------------------------");
   	 }
   	 
    }
	
     public static void findMaxSalary(HashMap<Department,ArrayList<Employee>> list)
     {
    	 for(Map.Entry<Department, ArrayList<Employee>> en:list.entrySet())
    	 {
    		 Employee e1=new Employee();
    		 System.out.println(en.getKey());
    		 for(Employee e:en.getValue())
    		 { 
    			 if(e.getSalary()>e1.getSalary())
    			 {
    				 e1=e;
    			 }
    			 System.out.println(e1);
    		 }
    		 System.out.println("---------------------------------------------------");
    	 }
    	
     }
     
     public static void findlessSalarythan(HashMap<Department,ArrayList<Employee>> list)
     {
    	 for(Map.Entry<Department, ArrayList<Employee>> en:list.entrySet())
    	 {
    		     
    		     if(en.getKey().getDname().equalsIgnoreCase("HR"))
    			 {
    				 for(Employee e:en.getValue())
    				 {
    					if(e.getSalary()<70000)
    					{
    					 System.out.println(e);
    					}
    				 }
    			 }
    		 }
    		 
    	 }
     
     public static void employeeName(HashMap<Department,ArrayList<Employee>> list)
     {
    	 for(Map.Entry<Department, ArrayList<Employee>> en:list.entrySet())
    	 {
    		
    		 for(Employee e:en.getValue())
    		 {
    			 if(e.getEname().charAt(0)=='a')
    			 {
    				 System.out.println(en.getKey());
    				System.out.println(e);
    			 }
    		 }
    	 }
     }
     
     public static void newAddEmployee(HashMap<Department,ArrayList<Employee>> list)
     {
    	 for(Map.Entry<Department, ArrayList<Employee>> en:list.entrySet())
    	 {
    		 {
    			    ArrayList<Employee>  elist=new ArrayList<Employee>();
    			    if(en.getKey().getDname().equalsIgnoreCase("IT"))
    			    {
    			    	elist=en.getValue();
    			    	elist.add(new Employee(111, "sonali",101, 65000));
    			    	list.replace(en.getKey(), elist);
    			    }
    			    
    			}
    		 
    	 }
     
     }
     
     public static void maxNumEmployee(HashMap<Department,ArrayList<Employee>> list)
     {
    	 

		 Department d=new Department();
		for(Map.Entry<Department,ArrayList<Employee>> en:list.entrySet())
		{
			int count=1;
		   int maxCount=0;
		  
		   for(Employee e:en.getValue()) {
			   count++;
		   }
		  if(count>maxCount)
		  {
			  maxCount=count;
			  d=en.getKey();
		  }
		}
		System.out.println(d);
     }
	public static void main(String[] args)
	{
	  
	   ArrayList<Employee> al1=new ArrayList<>();
	   al1.add(new Employee (101,"prachi",23000,1));
	   al1.add(new Employee (102,"vikas",45000,1));
	   al1.add(new Employee (103,"pranit",70000,1));
	   al1.add(new Employee (110,"prakash",56000,2));
	   
	   ArrayList<Employee> al2=new ArrayList<>();
	   al2.add(new Employee (104,"arpita",22000,2));
	   al2.add(new Employee (105,"reetu",40000,2));
	   al2.add(new Employee (106,"pooja",89000,2));
	   
	   
	   
	   ArrayList<Employee> al3=new ArrayList<>();
	   al3.add(new Employee (107,"nisha",28000,3));
	   al3.add(new Employee (108,"bhaskar",41000,3));
	   al3.add(new Employee (109,"pranay",99000,3));
	   
	   HashMap<Department, ArrayList<Employee>> dmap=new HashMap<>();
	   
	   dmap.put(new Department(1,"IT","pune"),al1);
	   dmap.put(new Department(2,"HR","pune"),al2);
	   dmap.put(new Department(3,"sales","pune"),al3);
	   
	   System.out.println("department wise Employee:");
       sortDepartment(dmap);	   
	   System.out.println("-------------------------------------------------");
	   System.out.println("greatest salary:");
	   findMaxSalary(dmap);
	   System.out.println("-------------------------------------------------------");
	   System.out.println("salary less than 70000");
	   findlessSalarythan(dmap);
	   System.out.println("----------------------------------------------------");
	   System.out.println("a character :");
	   employeeName(dmap);
	   System.out.println("---------------------------------------------------------");
	   System.out.println("maximum number of employee ");
	   maxNumEmployee(dmap);
	   System.out.println("------------------------------------------------------");
	   System.out.println("new add employee:");
	   newAddEmployee(dmap);
	   sortDepartment(dmap);
	   
	   
	   
	   
	   
	   
	   
	   

	
		
	
	

	}

}
