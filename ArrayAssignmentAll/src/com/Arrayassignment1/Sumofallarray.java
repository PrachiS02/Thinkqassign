package com.Arrayassignment1;

import java.util.Arrays;

public class Sumofallarray
{
	public static void sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println("sum of all array elements:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        sum(a);
	}

}
