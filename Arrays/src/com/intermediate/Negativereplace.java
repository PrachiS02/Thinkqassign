package com.intermediate;

import java.util.Arrays;

public class Negativereplace
{
    public static void replaceNegative(int a[])
    {
    	 for( int i=0;i<a.length;i++)
    	 {
    		 if(a[i]<0)
    		     a[i]=0;
    	 }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,3,-4,-5,3,8,-2};
       System.out.println(Arrays.toString(a));
       replaceNegative(a);
       System.out.println(Arrays.toString(a));
       
	}

}
