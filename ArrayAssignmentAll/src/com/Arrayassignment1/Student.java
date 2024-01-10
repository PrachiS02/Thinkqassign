package com.Arrayassignment1;

import java.util.Arrays;

public class Student {
	private int sid;
	private String sname;
	private Department dept;

	public Student() {
		super();
	}

	public Student(int sid, String sname, Department dept) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.dept = dept;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", dept="+dept;
	} 
     
}
