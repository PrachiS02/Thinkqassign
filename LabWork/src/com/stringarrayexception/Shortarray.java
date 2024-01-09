package com.stringarrayexception;

import java.util.Arrays;

public class Shortarray
{    
    public static void halfrsorted(int a[])
    {
	 //ascending order
	 int temp;
	 for(int i=0;i<a.length/2;i++) 
	 {
		 for(int j=i+1;j<a.length/2;j++)
		 {
			 if(a[i]>a[j])
			 {
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
			 }
		 }
	 }
	 
	 //descending order
	 for(int i=(a.length/2);i<a.length;i++) 
	 {
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]<a[j])
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
       int a[]= {3,8,4,9,10,43,7,11,30};
       System.out.println(Arrays.toString(a));
       halfrsorted(a);
       System.out.println("After half sorted:");
       System.out.println(Arrays.toString(a));
	}

}
