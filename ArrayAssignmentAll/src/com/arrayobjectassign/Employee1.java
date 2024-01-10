package com.arrayobjectassign;

public class Employee1 
{
    private int empno;
    private String ename;
    
	public Employee1() {
		super();
	}

	public Employee1(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
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

	@Override
	public String toString() {
		return "Employee1 [empno=" + empno + ", ename=" + ename + "]";
	}
    
	
	
	
    
}
