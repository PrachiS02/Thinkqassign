package com.advancelogic;

import java.util.Scanner;

public class PerfectNumber 
{
    public static void perfect(int n)
    {
    	int sum=0;
    	for(int i=1;i<n;i++)
    	{
    		if(n%i==0)
    			sum=sum+i; 
    	}
    	if(sum==n)
    		System.out.println(n+" is perfect number ");
    	else
    		System.out.println(n+" is not perfect number ");
    }
    	public static void main(String args[])
    	{
    		Scanner sc=new Scanner(System.in);
            System.out.println("enter the number : ");
            int num=sc.nextInt();
            perfect(num);
		}
    			

}
