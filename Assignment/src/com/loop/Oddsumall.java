package com.loop;

public class Oddsumall 
{
     
	public static int oddsumall(int n)
	{
		int sum=0;
		
		for(int i=1;i<=n;i++)
		{ 
			if(i%2!=0)
			{
			 sum=sum+i;
			} 
		}		
	   return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum of even number :"+oddsumall(10));
		
	}

}
