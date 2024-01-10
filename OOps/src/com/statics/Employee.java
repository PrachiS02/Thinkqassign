package com.statics;

public class Employee
{
     private int eid;
     private String ename;
     private double esal;
      //static String compname;
     //static String compname="HCL";
     private static String compname ;
     static int empcnt;
     
     //static block
     static
     {
    	 compname="HCL";
     }
     //instance block
     {
    	 System.out.println("instance block");
    	 compname="HCL";
    	 empcnt++;
     }
     public Employee()
     {
    	  System.out.println("in constructor");
    	  //compname="HCL";
      }
      
      Employee(int eid,String ename,double sal)
      {
    	  //this();
    	  this.eid=eid;
    	  this.ename=ename;
    	  this.esal=esal;
      }
      
      public void seteid(int eid)
      {
    	  this.eid=eid;
      }
      public int getid()
      {
    	  return eid;
      }
      public void setename(String ename)
      {
    	  this.ename=ename;
      }
      public String getename()
      {
    	  return ename;
      }
      public void seteid(double esal)
      {
    	  this.esal=esal;
      }
      public double getesal()
      {
    	  return esal;
      }
      
     
  	
  	public static void setCompanyName(String companyName)
  	{
  		Employee.compname= compname;
  	}
  	
  	public static String getCompName()
  	{
  		return compname;
  	}


      public String toString()
      {
    	  return eid+" "+ename+" "+esal;
      }


}
