package com.constructor;
public class Course
{
	private int id;
	private String name;
	private Subcourse course;
	
	 Course()
	{
		new Subcourse();
		System.out.println("default course constructor");
	}
	 Course(int id,String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
    public void setid(int id )
    {
    	this.id=id;
    }
    public int getId() 
    {
    	return id;
    }
    public void setName(String name )
    {
    	this.name=name;
    }
    public String getname() 
    {
    	return name;
    }
    public void setourse(Subcourse course)
    {
    	this.course=course;
    }
    public String toString()
	{
	  return id+" "+name+""+course+"";
	}

    
    public static void main (String args[])
     {
    	Course c1=new Course();
    	System.out.println(c1);
    	
    }
 }

