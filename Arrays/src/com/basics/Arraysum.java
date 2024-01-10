package com.basics;

import java.util.Arrays;

public class Arraysum {

	 public static int findsum(int a[])
     {
		 int sum=0;
     
    	 for(int i=0;i<a.length;i++)
    	 {
    		sum=sum+a[i];
    	 }
    	 return sum;
     }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int a[]= {2,3,4,5};
        System.out.println(Arrays.toString(a));
        
        System.out.println("sum of element :"+findsum(a));
        
}
}
