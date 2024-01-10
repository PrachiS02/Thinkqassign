package com.twodarrayassignment;

import java.util.Arrays;

public class Averageinnermostelement 

{
    public static int avg(int a[])
    {
    	int sum=0,avg;
    	for(int i=0;i<a.length;i++){
    		{
    			sum+=a[i];
    		}
    	}
		return avg=sum/a.length;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,6,7,8,9,1,2};
        System.out.println(Arrays.toString(a));
        avg(a);
        System.out.println("average of  array:"+(avg(a)));
	}

}
