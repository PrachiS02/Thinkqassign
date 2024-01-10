package com.advancelogic;

import java.util.Scanner;

public class ArmstrongNumber
{
    public static int countdigit(int n)
    {
    	int count=0;
    	do
    	{
    		count++;
    		n/=10;
    		
    	}while(n!=0);
		return count;	
    }
    
    public static int calpower(int b,int p)
    {
    	int result=1;
   
    	  for(int i=1;i<=p;i++)
    	  {
    		  result*=b;
    	  }
		return result;  
    	
    }
    
    public static void  checkarmstrong(int n)
    {
    	int org=n;
    	int sum=0;
    	int noofdig=countdigit(n);
    	do
    	{
    		int rem=n%10;
    		sum=sum+calpower(rem,noofdig);
    		n/=10;
    	}while(n!=0);
    	
    	if(org==sum)
    		System.out.println(org+" is armstrong number ");
    	else
    		System.out.println(org+" is not armstrong number");
    }
	 public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number : ");
        int n=sc.nextInt();
        checkarmstrong(n);
	}

}
