//7. Write two methods that return the average of an array with 
//following headers. 
//a. public static int average(int[] array) 
//b. public static double average(double[] array). 
//c. Use {1,2,3,4,5,6} , {6.0,3.4,6.4,1.2,4.0} to test the methods 
package com.Arrayassignment1;

import java.util.Arrays;

public class Checkarrayavg 
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
   
   public static double average(double a[])
   {
	   double sum=0,avg;
	   
	   for(int i=0;i<a.length;i++)
	   {
		   sum+=a[i];
		   
	   }
	   return avg=sum/a.length;
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {1,2,3,4,5,6};
       double b[]= {6.0,3.4,6.4,1.2,4.0};
       System.out.println(Arrays.toString(a));
       System.out.println("average of int array:"+(average(a)));
       System.out.println(Arrays.toString(b));
       System.out.println("average of double array:"+(average(b)));
       
	}

}
