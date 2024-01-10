package com.foreachloop;

public class Oddelements 
{
    public static void oddelement(int a[])
    {
    	for(int i=0;i<a.length;i++)
    	{
    		if(a[i]%2!=0)
    		{
    			System.out.println(a[i]);
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,2,3,5,6,7,8,9};
        for(int x:a)
        {
          System.out.println(x);	
        }
        System.out.println();
        
        oddelement(a);
	}

}
