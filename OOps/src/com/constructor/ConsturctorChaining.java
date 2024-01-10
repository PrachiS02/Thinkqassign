package com.constructor;

class Student1
{
	   int id;
	   String name;
	   float marks;
	   
	   Student1()
	   {
		   id=100;
		   name="unknown";
		   marks=33;
	   }
	   
	   Student1(int id,String name)
	   {
		   this();
		   this.id=id;
		   this.name=name;
	   }
	   
	   public String toString()
	   {
		   return id+" "+name+" "+marks;
	   }
}
public class ConsturctorChaining

{
	public static void main(String[] args)
	{
	
       Student1 s1=new Student1();
       System.out.println(s1);
       
       Student1 s2=new Student1(10,"abc");
       System.out.println(s2);
       
	}

}

