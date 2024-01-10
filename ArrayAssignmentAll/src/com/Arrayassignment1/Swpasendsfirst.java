//21. Given an array of ints, swap the first and last elements in the 
//array. Return the modified array. The array length will be at least 1. 
//swapEnds(*1, 2, 3, 4+) → *4, 2, 3, 1+ 
//swapEnds(*1, 2, 3+) → *3, 2, 1+ 
//swapEnds([8, 6, 7, 9, 5+) → *5, 6, 7, 9, 8+ 
package com.Arrayassignment1;

import java.util.Arrays;

public class Swpasendsfirst 
 {

	 public static void swapends(int []a)
	 {
		for(int i=0;i<a.length-1;i++)
		{
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
	 }
	public static void main(String[] args) 
	{
	int a[]= {1,2,3,4};
	System.out.println("original array:"+Arrays.toString(a));
	swapends(a);
	System.out.println("after swap array:"+Arrays.toString(a));
	}
}
