package com.loop;

import java.util.Scanner;

public class Sumevenall
{
		
		public static int evensumall(int n)
		{
			int sum=0;
			
			for(int i=1;i<=n;i++)
			{ 
				if(i%2==0)
				{
				 sum=sum+i;
				} 
			}		
		   return sum;
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("sum of even number :"+evensumall(10));
		

	}

}
