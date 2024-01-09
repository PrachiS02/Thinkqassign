package com.loop;

public class FactSum 
{
     public static int findSum(int n)
     {
    	 int fact=1,sum=0;
    	 for(int i=1;i<=n;i++)
    	 {
    		 fact=fact*i;
    		 sum+=fact;
    	 }
		return sum;
    	 
     }
	public static void main(String[] args) {
		System.out.println(findSum(5));

	}

}
