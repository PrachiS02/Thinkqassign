
//8. WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 
//0, 2, 4] 
package com.assignmentonarray;

import java.util.Arrays;
import java.util.Scanner;

public class Swapnumber 
{
	public static void swap(int a[])
	{
		int temp;
		int len=a.length;
		for(int i=0;i<len;i++)
		{
		  if(i==0)
		  {
			  temp=a[len-2];
			  a[len-2]=a[i];
			  a[i]=temp;
			  
		  }
		  else if(i==1)
		  {
			  temp=a[len-1];
			  a[len-1]=a[i];
			  a[i]=temp;
		  }
		}
	
	}
	public static void main(String[] args) 
  {
     int a[]= {2, 4, 9, 0};
     System.out.println(Arrays.toString(a));
     swap(a);
     System.out.println("after swapping:");
     System.out.println(Arrays.toString(a));
 }
  
}
