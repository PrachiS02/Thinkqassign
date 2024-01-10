//27. WAP to print maximum in columns. Means e.g. arr[][]= {{22, 31, 9}, {12, 5, 16}, 
//{34, 42, 2}} output is: 34, 42, and 16. 
package com.assignmentonarray;

import java.util.Arrays;

public class maxvalcolumn 
{
     public static void maxnumcolumn(int[][]a)
     {

    	for(int i=0;i<a[0].length;i++)
		{
			int max=a[0][i];
			for(int j=1;j<a.length;j++)
			{
				if(max<a[j][i])
				{
					max=a[j][i];
				}
			}
			System.out.print(max+" ");
		}
}
	public static void main(String[] args)
	{
	    int[][] a = {{3, 9, 3, 5},
	    		    {4, 19, 4, 9},
	    		    {2, 10, 5, 6}};
	    maxnumcolumn(a);
	 
	}
}

