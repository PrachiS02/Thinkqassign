//3.	WAP to print maximum in rowwise in 2D array. Means e.g. arr[][] = 		{{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.
package com.twodarrayassignment;

import java.util.Arrays;

public class Q3maxinrows 
{
	public static void maxnumrow(int[][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			int max=0;
			for(int j=0;j<a.length;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
			}
			System.out.print((i+1)+" row max num "+max);	
		}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{22, 31, 9}, {12, 25, 16}};
		
		maxnumrow(a);
		//System.out.println("max number in row");
		
	}

}
