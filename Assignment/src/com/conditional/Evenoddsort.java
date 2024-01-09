package com.conditional;

import java.util.Arrays;

public class Evenoddsort
{
	public static void shiftEvenFront(int a[])
	{
		int i=0,j;
		int temp;
		int len=a.length;
		while(i<a.length && a[i]%2!=0);
			i++;	
		for( j=i+1;j<a.length;j++)
		{
			if(a[j] %2==0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}
		}
	
		
			
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {10,2,3,5,6,4,8,7};
        System.out.println(Arrays.toString(a));
        shiftEvenFront(a);
        System.out.println("after sorting:");
        System.out.println(Arrays.toString(a));
	}

}
