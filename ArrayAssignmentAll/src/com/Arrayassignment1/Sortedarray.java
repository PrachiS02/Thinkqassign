package com.Arrayassignment1;

import java.util.Arrays;

public class Sortedarray 
{
	public static void sortArray(int a[])
	   {
		   int temp;
		   for(int i=0;i<a.length;i++)
		   {
			   for(int j=i+1;j<a.length;j++)
			   {
				   if(a[i]>a[j])// 
				   {
					   temp=a[i];
					   a[i]=a[j];
					   a[j]=temp;
				   }
			   }
		   }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,2,3,7,9,4};
         System.out.println(Arrays.toString(a));
         System.out.println("after sorting:");
         sortArray(a);
         System.out.println(Arrays.toString(a));
	}

}
