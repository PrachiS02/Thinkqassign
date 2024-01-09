package com.constructor;

public class Academy 
{
     private int id;
     private String name;
     private String course;
     private double fee;
     
     
	public int getId()
	{
		return id;
	}


	public void setId(int id)
	{
		this.id = id;
	}


	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public String getCourse()
	{
		return course;
	}


	public void setCourse(String course) 
	{
		this.course = course;
	}


	public double getFee() 
	{
		return fee;
	}


	public void setFee(double fee) 
	{
		this.fee = fee;
	}


	public static void main(String[] args)
	{
		Academy a1=new Academy();
		a1.setId(101);
		a1.setName("abc");
		a1.setCourse("java");
		a1.setFee(50000);
		System.out.println(a1.getId());
		System.out.println(a1.getCourse());
		System.out.println(a1.getName());
		System.out.println(a1.getFee());
		
	}

}
