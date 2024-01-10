package com.containment;

public class Employee
{
   private int eid;
   private String ename;
   private Department dept;
   
   Employee()
   {
	   
   }
   
   Employee(int eid,String ename,Department department)
   {
	   this.eid=eid;
	   this.ename=ename;
	   this.dept=dept;
   }

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename)
	{
		this.ename = ename;
	}

	public Department getDept()
	{
		return dept;
	}

	public void setDepartment(Department dept)
	{
		this.dept = dept;
	}


	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", department=" + dept + "]";
	}

	
   
}
