package com.basics;

import java.util.Arrays;
import java.util.Scanner;

public class Sumofeven 
{
    public static int sumeven(int a[])
    {
    	int sum=0;
    	for(int i=0;i<a.length;i++)
    	{
    	if(a[i]%2==0)
    	{
    		sum +=a[i];
    	}
    	}
    	return sum;
    }
    
    public static int sumodd(int a[])
    {
    	
    	int sumod=0;
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]%2!=0)
    		{
    			sumod+=a[i];
    		}
    	}
		return sumod;
    }
    
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int a[]=new int[5];
        System.out.println("enter elements:");
        for(int i=0;i<a.length;i++)
        {
        	a[i]=sc.nextInt();
        	
        }
        System.out.println(Arrays.toString(a));
        System.out.println("sum of even:"+sumeven(a));
        System.out.println("sum of odd:"+sumodd(a));
      
	}

}
