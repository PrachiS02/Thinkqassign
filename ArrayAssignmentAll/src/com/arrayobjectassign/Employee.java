package com.arrayobjectassign;

public class Employee
{
   private int eid;
   private String ename;
   private double salary;
   private Date date;
   private Department dept;
   
   
   public Employee()
   {
	super();
   }


   public Employee(int eid, String ename, double salary, Date date, Department dept) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.salary = salary;
	this.date = date;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", date=" + date + ", dept=" + dept
				+ "]";
	}
   
   
   
   
}
