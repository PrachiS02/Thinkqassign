//11. WAP to calculate average of all elements in an Array except max and min element 
//(Means don’t include the highest and lowest number of your array in your average).
package com.assignmentonarray;

import java.util.Arrays;

public class Average
{
   public static void averagenum(int a[])
   {
	   int max=a[0];
	   int min=a[0];
	   float sum=a[0];
	   for(int i=1;i<a.length;i++)
	   {
		   sum+=a[i];
		   if(a[i]>max)
			   max=a[i];
		   else if(a[i]<min)
			   min=a[i];
	   }
	   float avg=((sum-max-min)/(a.length-2));
	   System.out.println("average betn min and max: "+avg);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,7,2,4,9};
		 System.out.println(Arrays.toString(a));
		 averagenum(a);
	}

}
