package com.foreachloop;

import java.util.Arrays;

public class Average
{
    public static int calAverage(int a[])
    {
    	int sum=0,avg;
    	
    	for(int i=0;i<a.length;i++)
    	{
    		sum+=a[i];
    	}
		return avg=sum/a.length;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {1,2,3,4,5,6};
          
          for(int x:a)
          {
        	  System.out.println(x);
          }
          
          System.out.println("average of elements:"+(calAverage(a)));
	}

}
