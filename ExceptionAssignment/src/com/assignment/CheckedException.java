package com.assignment;

import java.io.IOException;

public class CheckedException 
{
	void method1() throws IOException {
		throw new IOException("input error");
	}

	void method2() {
		try 
		{
			method1();
		} 
		catch (IOException e) 
		{

			e.printStackTrace();
		}
	}

	void method3() {
		try 
		{
			method2();
		} catch (Exception e) 
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		CheckedException obj = new CheckedException();

		obj.method3();

	}
}
