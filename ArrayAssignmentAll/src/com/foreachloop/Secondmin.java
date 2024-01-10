package com.foreachloop;

import java.util.Arrays;

public class Secondmin 
{
    public static void secondmin(int a[])
    {
    	int min=a[0];
    	int secondmin=a[0];
    	
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]<min)
    		{
    			secondmin=min;
    			min=a[i];
    		}
    		else if(secondmin>a[i] && a[i]!=min)
    		{
    			secondmin=a[i];
    		}
    
    	}
    	System.out.println("Min number:"+min);
    	System.out.println("Second min:"+secondmin);
    	
    	
    }
	public static void main(String[] args)
	{
		int a[]= {-20,0,-25,15,19,37,23};
		for(int x:a)
		{
			System.out.println(x);
		}
		
		secondmin(a);
		
		

	}

}
