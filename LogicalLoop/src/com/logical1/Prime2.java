package com.logical1;

import java.util.Scanner;

public class Prime2 {
	
	public static boolean checkprime(int num)
	{
		boolean status=true;
		
		if(num==0 || num==1)
			status=false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
				status=false;
				break;
				}
			}
		}
		
		return status;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.println("enter the number : ");
	       int n=sc.nextInt();
       if(checkprime(n))
       
    	   System.out.println(n+" is prime number ");
   		
   		else
   			System.out.println(n+" is not prime number ");
       
	}

}
