package com.assignment;

public class HandleArrayoutException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {12,34,2,4,5};
		
		try
		{
		
			for(int i=0;i<arr.length;i++) 
			{
				System.out.println(arr[i]);
		    }
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("cought the exception");
			
			
		}
		System.out.println("continue..........");
		
		

	}
	}

