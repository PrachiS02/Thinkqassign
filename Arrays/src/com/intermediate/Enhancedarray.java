package com.intermediate;

public class Enhancedarray {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
     int a[]= {1,2,34,5,6};
     
     //can not update
     //no access to index
     for(int x:a)
     {
    	 System.out.println(x);
     }
     
     for(int x:a)
     {
    	 x=x*x*x;
     }
     //no change is visible
     for(int x:a)
     {
    	 System.out.println(x);
     }
     
	}

}
