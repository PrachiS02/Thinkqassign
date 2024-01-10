package com.basics;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]=new int[5];
       
       arr[0]=10;
       arr[1]=20;
       arr[2]=30;
       arr[3]=40;
       arr[4]=50;
       
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println(arr[i]);
       }
       System.out.println("-------------------------------------");
       
       int a[]= {1,2,3,4,5,6,7};
       for(int i=0;i<arr.length;i++)
       {
    	   System.out.println(a[i]);
       }
       
       System.out.println("-------------------------------------");
       
       int a1[]= {1,2,3,4,5,6,7};
      
    	   System.out.println(a1);//giving hashcode
    	   System.out.println(Arrays.toString(a1));//
       
	}

}
