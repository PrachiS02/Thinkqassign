package com.comparator;

public class Employee {
	private int id;
	private String ename;
	private double esal;

	public Employee() {
		super();
	}

	public Employee(int id, String ename, double esal) {
		super();
		this.id = id;
		this.ename = ename;
		this.esal = esal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", ename=" + ename + ", esal=" + esal + "]";
	}
   
   
   
}
