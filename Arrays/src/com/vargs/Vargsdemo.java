package com.vargs;

public class Vargsdemo
{
    static void display(int a[])
    {
    	for(int x:a)
    	{
    		System.out.println(x+" ");
    	}
    	System.out.println();
    }
    
    //ellipsis
    static void display1(int ...a)
    {
    	for(int x:a)
    	{
    		System.out.println(x+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {2,3,4,5};
        int b[]= {1,45,5,67};
        
        display1(1,2,3,4);
	}

}
