package com.oopslab;

public class MethodOverloading {

	public void methodTest(Object object)
	{
		System.out.println("Calling object method");
	}
	
	public void methodTest(String object)
	{
		System.out.println("calling String method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m1=new MethodOverloading();
	
		m1.methodTest(10);
	}

}
