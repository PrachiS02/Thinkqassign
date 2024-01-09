package com.thisassignment;

public class Student
{
     private int id;
     private String name;
     
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
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student s1=new Student();
          
          s1.setId(11);
          s1.setName("abc");
          s1.getId();
          s1.getName();
          System.out.println(s1);
          Student s2=new Student();
          s2.setId(21);
          
          s2.setName("raj");
          s2.getName();
          System.out.println(s2);
	}

}
