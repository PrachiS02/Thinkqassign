package com.comparable;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String ename;
	private String job;
	private int age;


	public Employee() {
		super();
	}


	public Employee(int id, String ename, String job, int age) {
		super();
		this.id = id;
		this.ename = ename;
		this.job = job;
		this.age = age;
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


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", job=" + job + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Employee e) {
		//return this.id-e.getId();//ascending
		return this.ename.compareTo(e.getEname());
		
		
		
			
		//return e.getId()-this.id;//descending order
		
		
	
		
	}
  
   
}
