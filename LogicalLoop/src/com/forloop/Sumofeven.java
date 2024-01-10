package com.forloop;

import java.util.Scanner;

public class Sumofeven {
	
	public static int evensum()
	{
		int sum=0;
		for(int i=1;i<=20;i++)
		{ 
			if(i%2==0)
			{
			 sum=sum+i;
			} 
		}	
		
		
		
		return sum;
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("sum of even number :"+evensum());

	}

}
