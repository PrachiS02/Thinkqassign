package com.arrayobjectassign;

public class EmployeeTest 
{
  public static void samesalary(Employee e1[])
  {
	  for(int i=0;i<e1.length;i++)
	  {
		  for(int j=i+1;j<e1.length;j++)
		  {
			  if(e1[i].getSalary()!=e1[j].getSalary())
			     continue;
			  else
			  {
				  System.out.println(e1[i]);
				  System.out.println(e1[j]);
				  break;
				  
			  }
		  }
	  }
  }
  
  static void samejoindate(Employee e1[],Date date[])
  {
	  
//	  for(int i=0;i<e1.length;i++)
//	  {
//		  for(int j=i+1;j<e1.length;j++)
//		  {
//			  if(e1[i].getDate()!=e1[j].getDate())
//			     continue;
//			  else
//			  {
//				  System.out.println(e1[i]);
//				  System.out.println(e1[j]);
//				  break;
//				  
//			  }
//		  }
//	  }  
	   for(Date d:date)
	   {
	     System.out.println(d);
	     for(Employee e:e1)
	     {
	    	 if(e.getDate().equals(d))
	    	 {
	    		 System.out.println(e.getEname()+" "+e.getEid());
	    	 }
	     }
	     System.out.println("-----------------------------------------------------------------------");
		  
	   }
		   
		   
   }
  public static void samedept(Employee e1[],Department dept[])
  {
//	  for(int i=0;i<e1.length;i++)
//	  {
//		  for(int j=i+1;j<e1.length;j++)
//		  {
//			  if(e1[i].getDept()!=e1[j].getDept())
//			     continue;
//			  else
//			  {
//				  System.out.println(e1[i]);
//				  System.out.println(e1[j]);
//				  break;
//				  
//			  }
//		  }
//	  }

	  
	  for(Department d:dept)
	   {
	     System.out.println(d.getDname());
	     for(Employee e:e1)
	     {
	    	 if(e!=null && d!=null)
	    	 {
	    	 if(e.getDept().equals(d))
	    	 {
	    		 System.out.println(e.getEid()+" "+e.getEname());
	    	 }
	    	 }
	     }
	     System.out.println("-----------------------------------------------------------------------");
		  
	   }
  }
	public static void main(String[] args) 
	
	{
		
		 Date d[]=new Date[3];
		 d[0]=new Date(1, 10, 2001);
		 d[1]=new Date(3,10,2001);
		 d[2]=new Date(2,12,2000);
		
		 Department dt[]=new Department[3];
		 dt[0]=new Department(1,"IT");
		 dt[1]=new Department(2,"HR");
		 dt[2]=new Department(3,"Sales");
		 
		 
				 
				 
		Employee e[]=new Employee[3];
//		e[2]=new Employee();
//		e[2].setEid(103);
//		e[2].setEname("pranali");
//		e[2].setSalary(87000);
//		e[2].setDate(d1[2]);
		e[0]=new Employee(101,"Prachi",87000,d[0],dt[0]);
		e[1]=new Employee(102,"Pratik",45000,d[1],dt[0]);
     	e[2]=new Employee(103,"Pranali",45000,d[1],dt[2]);
		
		for(Employee e1:e)
		{
			System.out.println(e1);
		}
		System.out.println("----------------------------------------------------------------------");
		//System.out.println("same salary");
		//samesalary(e);
		System.out.println("----------------------------------");
		samejoindate(e,d);
		System.out.println("------------------------------------------------------------------------");
		//samedept(e,dt);
		
	}
}
