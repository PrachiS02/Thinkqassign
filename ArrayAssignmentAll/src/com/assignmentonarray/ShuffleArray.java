package com.assignmentonarray;

import java.util.Arrays;

public class ShuffleArray
{
     public static void shufflearr(int a[])
     {
    	int firstelement=a[0];
    	for(int i=0;i<a.length-1;i++)
    	{
    		a[i]=a[i+1];
    		
    	}
    	 a[a.length-1]=firstelement;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(a));
        shufflearr(a);
        System.out.println(Arrays.toString(a));
        
	}

}
