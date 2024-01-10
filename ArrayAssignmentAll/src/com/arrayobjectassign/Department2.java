package com.arrayobjectassign;

public class Department2
{
   private int deptid;
   private String deptname;
   public Department2()
   {
	super();
   }
   public Department2(int deptid, String deptname) {
	super();
	this.deptid = deptid;
	this.deptname = deptname;
   }

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	@Override
	public String toString() {
		return "Department2 [deptid=" + deptid + ", deptname=" + deptname + "]";
	}
   
   
   
   
   
   
   
}
