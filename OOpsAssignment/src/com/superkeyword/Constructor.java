package com.superkeyword;

class A
{
	void Parent() 
	{
		
		System.out.println("Parent Constructor");
	}
}

class B extends A
{ 

	public void Child()
	{
		super.Parent();
		System.out.println("Child Constructor");
	}
}

public class Constructor
{


	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	 B b=new B();
	 b.Child();
	 
		 

	}

}
