package com.queuestack;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

 class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	public Employee() {
		super();

	}
	public Employee(int id, String name) {
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
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Employee e) {
		
		return this.getName().compareTo(e.getName());
	}



public class QueueComparable 
{
	public static void main(String[] args) 
	{
		 Queue<Employee> empQueue = new LinkedList<>();
			
			empQueue.offer(new Employee(103, "pranali"));
			empQueue.offer(new Employee(101, "mayuresh"));
			empQueue.offer(new Employee(104, "Shital"));
			empQueue.offer(new Employee(102, "divya"));
			empQueue.offer(new Employee(105, "reva"));
			empQueue.offer(new Employee(106, "priya"));
			
			for(Employee e : empQueue) {
				System.out.println(e);
			}
			System.out.println("------------------------------------------");
			
			Collections.sort((List<Employee>) empQueue);
			
			for(Employee e : empQueue) {
				System.out.println(e);
			}
			


		}

}





}