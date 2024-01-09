package com.constructor;

public class Employee 
{
	private int eid;
	private String ename;
	private double salary;
	
	 public Employee()
	 {
		
	 }
	
	public Employee(int eid, String ename, double salary)
	{
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
	}
	
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	
	public int getEid()
	{
		return eid;
	}
	
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	
	public String getEname()
	{
		return ename;
	}
	
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	
	public String toString()
	{
		return eid+" "+ename+" "+salary;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Employee e3= new Employee();
		
		e3.setEid(103);
		e3.setEname("Pooja");
		e3.setSalary(4500);
		
		
		System.out.println(e3.getEid());
	}

}
