package com.Arrayassignment1;

import java.util.Arrays;

public class Ascendingsort 
{
	public static void ascendingsorted(int a[])
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
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,2,1,4,10,30,60};
	       System.out.println(Arrays.toString(a));
	       ascendingsorted(a);
	       System.out.println("ascending sort:");
	       System.out.println(Arrays.toString(a));
	}

}
