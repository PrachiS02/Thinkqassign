package com.exception;

public class Nestedtry 
{

	public static void main(String[] args)
	{
		int a[]= {12,0,3};
		try
		{
           for(int i=0;i<a.length;i++)
           {
        	   try
        	   {
        		   System.out.println("value:"+100/a[i]);
        	   }
        	   catch(ArithmeticException e)
        	   {
        		   System.out.println(e);
        	   }
           }
	      
		}catch (Exception e) {
			System.out.println(e);
		}
}
}