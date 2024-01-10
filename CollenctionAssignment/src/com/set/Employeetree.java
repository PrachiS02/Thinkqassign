package com.set;

import java.util.Objects;

public class Employeetree implements Comparable<Employeetree>{
	private int id;
	private String name;
	private int salry;

	public Employeetree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employeetree(int id, String name, int salry) {
		super();
		this.id = id;
		this.name = name;
		this.salry = salry;
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

	public int getSalry() {
		return salry;
	}

	public void setSalry(int salry) {
		this.salry = salry;
	}

	
	

	@Override
	public String toString() {
		return "Employeetree [id=" + id + ", name=" + name + ", salry=" + salry + "]";
	}

	@Override
	public int compareTo(Employeetree o) {
		// TODO Auto-generated method stub
		return this.id-o.getId();
	}

	
		  
		
		   
		
	}






