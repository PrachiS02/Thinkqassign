package com.Arrayassignment1;

import java.util.Arrays;

public class Mergearray2
{
	public static int[] completemerge(int a[], int b[])
	{
		int mar[] = new int[a.length + b.length];
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			mar[index++] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			mar[index++] = b[i];
		}
		return mar;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int a[]= {1,2,3,4,5,6};
		  
		  int b[]= {11,12,13,14};
		  
		  System.out.println(Arrays.toString(a));
		  System.out.println(Arrays.toString(b));
		  
		  System.out.println(" merge of two array:");
		  System.out.println(Arrays.toString(completemerge(a,b)));
	}

}
