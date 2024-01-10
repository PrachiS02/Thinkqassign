package com.throwskeyword;

import java.io.IOException;

public class CheckedException
{
	void method1() throws IOException
	   {
		   throw new IOException("INPUT ERROR");
	   }
	   void method2() throws IOException
	   {
		   
		   
		   method1();
		   
	   }
	   void method3() throws IOException
	   {
		   method2();
	   }
	public static void main(String[] args) {

     CheckedException ce= new CheckedException();
     try
     {
       ce.method3();
     }
     catch (Exception e) {
		System.out.println(e);
	  }
     
	}

}
