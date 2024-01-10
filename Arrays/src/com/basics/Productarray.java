package com.basics;

import java.util.Arrays;

public class Productarray 
{
	 public static int findpro(int a[])
     {
		 int pro=1;
     
    	 for(int i=0;i<a.length;i++)
    	 {
    		pro=pro*a[i];
    	 }
    	 return pro;
     }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int a[]= {2,3,4,5};
        System.out.println(Arrays.toString(a));
        
        System.out.println("product of element :"+findpro(a));
        
	
}
}
