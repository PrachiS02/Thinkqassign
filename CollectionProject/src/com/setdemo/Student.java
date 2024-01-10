package com.setdemo;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	private Course course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(course, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(course, other.course) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
	}
 
}
