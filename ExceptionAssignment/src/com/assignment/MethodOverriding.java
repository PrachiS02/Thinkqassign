package com.assignment;
class Parent
{
	int data=50;
	// not throwing exception
	
	void printData()
	{
		System.out.println(data);
	}
	void printData2() throws ArithmeticException
	{
		System.out.println(data/0);
	}
}
 class Child extends Parent
 {
	 int val=0;
	 
	 void printData() throws ArithmeticException
	 {
		 if(val==0)
			 throw new ArithmeticException();
		 System.out.println(data/val);
	 }
	 // can throw unchecked exception of same or other
	 
	 void printData2() throws ArithmeticException
	 {
		 
		 if(val==0)
			 throw new ArithmeticException();
		 System.out.println(data/val);
		
	 }
 }

public class MethodOverriding 
{

	public static void main(String[] args)
	{

		Child c= new Child();
		c.printData();
		c.printData2();
	}

}
