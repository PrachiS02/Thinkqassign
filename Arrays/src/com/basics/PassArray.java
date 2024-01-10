package com.basics;

import java.util.Arrays;

public class PassArray 
{
     public static void squarenum(int a[])
     {
    	 for(int i=0;i<a.length;i++)
    	 {
    		 a[i]=a[i]*a[i];
    	 }
     }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        int a[]= {2,3,4,5};
        System.out.println(Arrays.toString(a));
        
        squarenum(a);
        System.out.println(Arrays.toString(a));
        
        
	}

}
