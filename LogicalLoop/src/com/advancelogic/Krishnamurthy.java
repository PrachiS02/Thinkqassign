package com.advancelogic;

import java.util.Scanner;

public class Krishnamurthy 
{
    public static long calfact(int n)
    {
    	long fact=1;
    	for(int i=1;i<=n;i++)
    		fact*=i;
    	return fact;
    }
    
    public static void checkkrishnamurthy(int no)
    {
    	int original=no;
    	long sum=0;
    	
    	do
    	{
    		int rem=no%10;
    		sum=sum+calfact(rem);
    		no/=10;
    	}while(no!=0);
    	
    	if(original==sum)
    		System.out.println(original+" is a krishnamurthy number ");
    	else
    		System.out.println(original+" is not krishnamurthy number ");
    		
    }
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number : ");
		int num=sc.nextInt();
		checkkrishnamurthy(num);
	}

}
