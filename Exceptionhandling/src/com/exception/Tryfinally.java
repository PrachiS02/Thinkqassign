package com.exception;

public class Tryfinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try
       {
    	   int a=10;
    	   System.out.println(a/0);
       }
       finally
       {
    	   System.out.println("last code");
       }
       
       //
	}

}
