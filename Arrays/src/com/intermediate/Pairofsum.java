package com.intermediate;

import java.util.Arrays;

public class Pairofsum
{
    public static void findpairs(int a[],int sum)
    {
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]>sum)
    			continue;
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[i]+a[j]==sum)
    			{
    			  System.out.println("{"+a[i]+","+a[j]+"}");
    			  //break; for repeated value not consider
    			}
    			
    		}
    	
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,3,4,9,5,6,7,8};
       int s=8;
       System.out.println(Arrays.toString(a));
       System.out.println("sum is:"+s);
       System.out.println("pairs are:");
       findpairs(a,s);
	}

}
