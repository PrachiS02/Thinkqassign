//2. WAJP2 calculate the average value of array elements
package com.Arrayassignment1;

import java.util.Arrays;

public class Averagearray
{
	public static int average(int a[])
	   {
		   int sum=0;
		   int avg;
		   
		   for(int i=0;i<a.length;i++)
		   {
			   sum+=a[i];
			   
		   }
		   return avg=sum/a.length;
		   
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,7,8,9,1,2};
        System.out.println(Arrays.toString(a));
        average(a);
        System.out.println("average of  array:"+(average(a)));
	}

}
