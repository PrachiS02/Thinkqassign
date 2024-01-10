package com.arrayobjectassign;

public class Employee2 
{
	private int empno;
    private String ename;
    private Department2 dept;
    
	public Employee2() {
		super();
	}

	public Employee2(int empno, String ename, Department2 dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.dept = dept;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Department2 getDept() {
		return dept;
	}

	public void setDept(Department2 dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee2 [empno=" + empno + ", ename=" + ename + ", dept=" + dept + "]";
	}

	
    
}
