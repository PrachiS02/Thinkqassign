package com.arrayobjectassign;

public class Student 
{
   private int rollno;
   private String name;
   private int age;
   private float marks;
   
   Student()
   {
	   
   }

    public Student(int rollno, String name, int age, float marks) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.age = age;
	this.marks = marks;
   }

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
    
    
   
   
}
