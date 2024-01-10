//10. Write a Java program to find a missing number in an array. Means e.g. array has 1 
//to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 
//5 
package com.assignmentonarray;

import java.util.Arrays;

public class Missingelement 
{
   public static void misselement(int a[])
   {
	   int n=a.length+1;
	   int sum=n*(n+1)/2;
	   //int total=0;
	   
	   for(int i=0;i<a.length;i++)
	   {
			   sum-=a[i];	  
	   }
	   System.out.println("missing element:"+sum);
	  	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,2,3,4,5,6,7,8,9,11,12};
         System.out.println(Arrays.toString(a));
         
         misselement(a);
	}

}
