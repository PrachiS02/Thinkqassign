package com.basics;

import java.util.Arrays;

public class Primenum
{

	public static boolean checkPrime(int num)
	{
		if(num==0||num==1)
		   return false;
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					return false;
				}
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {1,2,3,4,5,6,7};
     System.out.println(Arrays.toString(a));
     System.out.println("prime numbers in array: ");
     
     for(int i=0;i<a.length;i++)
     {
    	 if(checkPrime(a[i]))
    		 System.out.println(a[i]);
     }
     
     //sum of prime number
     
     int sum=0;
     for(int i=0;i<a.length;i++)
     {
    	 if(checkPrime(a[i]))
    		 sum+=a[i];
    	 
     }
     System.out.println("sum of prime number is:"+sum);
	}

}
