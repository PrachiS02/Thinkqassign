package com.containment;

public class Employee 
{
   private int eid;
   private String ename;
   private double sal;
   private Department dept;
   
   Employee()
   {
	   
   }

    public Employee(int eid, String ename, double sal, Department dept) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.sal = sal;
	this.dept = dept;
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

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", dept=" + dept + "]";
	}
    
    
   
   
}
