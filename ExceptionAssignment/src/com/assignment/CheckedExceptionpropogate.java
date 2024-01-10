package com.assignment;

import java.io.IOException;

public class CheckedExceptionpropogate 
{
	void method1() throws IOException
	{
		throw new IOException("input erro...........");
	}
	
	void method2() throws IOException
	{
		method1();
	}
	void method3() 
	{
		try
		{
			method2();
		}catch(Exception e) 
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CheckedExceptionpropogate cp=new CheckedExceptionpropogate();
    cp.method3();
	}

}
