package com.assignment;

public class MainThrowException {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try
		{
		 throw new Exception("Uncaught exception in main method");
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
