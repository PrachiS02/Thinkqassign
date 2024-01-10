package com.exception;

public class Firstexceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=10;
	     int y=10;
	     try
	     {
	     int result=(x+y)/(x-y);
	     System.out.println(result);
	     }
	     catch(ArithmeticException e)
	     {
	    	 System.out.println(e);
	     }
	     int s=(2*x)+(2*y);
	     System.out.println(s);
	}

}
