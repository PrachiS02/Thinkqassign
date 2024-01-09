package com.oopslab;

public class Person
{
    public int age;
    private String name;
     
	public static void main(String[] args)
	{
		
       Person p1=new Person();
       Person p2=new Person();
       p1.age=20;
       p1.name="prachi";
       
       System.out.println(p1.age);
       System.out.println(p1.name);
       
	}

}
