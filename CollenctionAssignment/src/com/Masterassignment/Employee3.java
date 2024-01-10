package com.Masterassignment;

public class Employee3 implements Comparable<Employee3> {
	private int id;
	String name;

	public Employee3() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee3(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	
	@Override
	public String toString() {
		return "Employee3 [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee3 o) {
		// TODO Auto-generated method stub
		return this.id-o.getId();
	}

}
