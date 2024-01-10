package com.Arrayassignment1;

import java.util.Arrays;

public class Countnegativenum 
{
    public static void countNegative(int a[])
    {
    	int count=0;
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]<0)
    		{
    			count++;
    		}
    	}
    	System.out.println("count of negative number in array:"+count);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-1,-2,-3,-8,6,7};
	      System.out.println(Arrays.toString(a));
	      countNegative(a);
	}

}
