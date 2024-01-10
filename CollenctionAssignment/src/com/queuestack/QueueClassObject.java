package com.queuestack;

import java.util.LinkedList;
import java.util.Queue;

class Student {

	private int rollNo;
	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

public Student(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}

public int getRollNo() {
	return rollNo;
}

public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
}
public class QueueClassObject
{

	public static void main(String[] args) {
		   Queue<Student> stdQueue = new LinkedList<>();
				
				stdQueue.offer(new Student(101, "Sahil"));
				stdQueue.offer(new Student(102,"Priya"));
				
				for(Student s : stdQueue) {
					System.out.println(s);
				}

			}



	}

}
