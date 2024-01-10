package com.shiftingelement;

import java.util.Arrays;

public class Negativeatend
{
	public static void shiftNegative1(int ar[])
	{
		int i,j;
		int temp;
		int len=ar.length;
		
		for( i=0;i<len;i++)
		{
			if(ar[i]>=0)
				continue;
			else
			{
				for(j=len-1;j>=0&&i<j;j--)
				{
					if(ar[j]>=0)
					{
						temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
						break;
					}
				}
			}
			
		}
			
	}
	
	public static void shiftNegativeFront(int ar[])
	{
		int i,j;
		int temp;
		int len=ar.length;
		
		for( i=0;i<len;i++)
		{
			if(ar[i]<0)
				continue;
			else
			{
				for(j=len-1;j>=0&&i<j;j--)
				{
					if(ar[j]<0)
					{
						temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
						break;
					}
				}
			}
			
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {-1,2,90,9,-2,5,-1,6};
	        System.out.println(Arrays.toString(a));
	        shiftNegativeFront(a);
	        System.out.println("after sorting:");
	        System.out.println(Arrays.toString(a));
	}

}
