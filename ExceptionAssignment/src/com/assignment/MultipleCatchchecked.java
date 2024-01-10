package com.assignment;

import java.io.IOException;

public class MultipleCatchchecked 
{
	public static void multipleCatch(int n)
	{
		try
		{
			System.out.println(" number "+n);
		 throw new IOException("Checked exception"); 
		}
		catch (IOException e) {
			System.out.println(e);
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		multipleCatch(num);
	} 

}
